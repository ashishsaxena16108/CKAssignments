//Q1.
var submitBtn = document.getElementById('submit-btn');
var inputName = document.getElementById("name-input");
var inputAge = document.getElementById("age-input");
var form = document.getElementById('name-form');
function validateForm(){
    if(inputName.value === ''){
        alert("Name cannot be empty");
    }
    else if(inputAge.value<18){
        alert("You cannot submit this form as you are less than 18");
    }
    else{
        alert('Form submitted successfully');
        form.submit();
    }
}
submitBtn.addEventListener("click",(e)=>{
   e.preventDefault();
   validateForm();
})

//Q1 ends here

//Q2
var boxDiv = document.querySelector('.box')
boxDiv.addEventListener("mouseover",()=>{
    boxDiv.style.backgroundColor='rgb(55, 219, 55)';
})
boxDiv.addEventListener("mouseout",()=>{
    boxDiv.style.backgroundColor='rgb(84, 208, 224)';
})
//Q2 ends here

//Q3
var arr1 = [1,2,3,4,5];
arr1.push(6);
console.log("Q3 ",arr1);
//Q3 ends here

//Q4
var arr2 = [1,2,3,4,5];
arr2.shift();
console.log("Q4",arr2);
//Q4 ends here

//Q5
var arr3 = [1,2,3,4,5];
arr3.splice(3,0,7);
console.log("Q5",arr3);
//Q5 ends here

//Q6
var nums = [1,3,4,3,3,2];
modnums = nums.map((i)=>{
    if(i==3)
        return 7;
    else
     return i;
})
console.log("Q6",modnums);

//Q6 ends here

//Q7
var unsortedarr = [9,3,7,2,1,8];
function sort(array){
  array.forEach((i)=>{
     var left = array.filter((j)=>j<i);
     var right = array.filter((j)=>j>i);
     left.push(i);
     array=left.concat(right);
  })
  return array;
}
var sortedarray=sort(unsortedarr);
console.log("Q7",sortedarray);

//Q8
var arr=[1,2,3,4,5,6];
var reversedArray = new Array();
arr.forEach((i)=>{
    reversedArray.unshift(i);
})
console.log("Q8",reversedArray);

//Q8 ends here

//Q9
arr=[1,2,3,4,5,6];
console.log("Q9",arr.indexOf(4));
//Q9 ends here