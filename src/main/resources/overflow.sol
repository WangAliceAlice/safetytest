contract overflow {
uint8 x =1;
uint8 y = 2;
function over() public {
       x += 1;
       uint8 z = x+y;
    }
}