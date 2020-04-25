contract Fund {
uint8 x =1;
mapping ( address => uint ) balances ; //股权
function withdraw () public { //撤回以太币函数
if ( msg . sender . call . value ( balances [ msg . sender ]) ())
     balances [ msg . sender ] = 0;
}
}
