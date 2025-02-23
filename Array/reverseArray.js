let arr = [1,2,3,4,5,6,7,8,9];
 
 n = arr.length;
 const temp = []
 
 for (let i = 0; i < n; i++) {
     temp[i] = arr[n - i -1]; 
}
console.log(temp)
console.log(n)
