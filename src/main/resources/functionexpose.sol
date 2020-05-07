contract nomodify {
  function destroycontract (address _to){
   selfdestruct(_to);
  }
  function initWallet(address[] _owners, uint _required, uint _daylimit) {
      initDaylimit(_daylimit);
      initMultiowned(_owners, _required);
    }
}