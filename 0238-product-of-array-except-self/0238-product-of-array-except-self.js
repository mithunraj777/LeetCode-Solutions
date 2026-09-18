/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let l = nums.length;
    let result=[1];
    for(let i=1;i<l;i++){
        result[i]=result[i-1]*nums[i-1];
    }
    let r=1;
    for(let i=l-1;i>=0;i--){
        result[i]=result[i]*r;
        r=r*nums[i];
    }
    return result;
};