contract CallTest{

    function callData(bytes data){
        this,call(data);
    }

    contract Delegation {
        address public owner;
        Delegate delegate;

        function Delegation(address _delegateAddress) {
            delegate = Delegate(_delegateAddress);
            owner = msg.sender;
        }
        function f() {
            if (delegate.delegatecall(msg.data)) {
                this;
            }
        }
    }
























