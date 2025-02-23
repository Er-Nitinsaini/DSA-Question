let arr = [1, 5,3,56,3,5]

var max = -1;

for(let i = 0; i<arr.length; i++){
    if (max < arr[i]) {
        max = arr[i]
    }
}
console.log(max)
