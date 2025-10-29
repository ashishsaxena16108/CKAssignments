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
var arr = [1,2,3,4,5];
arr.push(6);
console.log(arr);
//Q3 ends here

//Q4
arr.shift();
console.log(arr);
//Q4 ends here

//Q5
arr.splice(3,0,7);
console.log(arr);
//Q5 ends here

//Q6
var nums = [1,3,4,3,3,2];
modnums = nums.map((i)=>{
    if(i==3)
        return 7;
    else
     return i;
})
console.log(modnums);

//Q6 ends here

//Q7
var unsortedarr = [3,7,2,1,8];
function sort(array){
   var done = false;
  while (!done) {
    done = true;
    for (var i = 1; i < array.length; i += 1) {
      if (array[i - 1] > array[i]) {
        done = false;
        var tmp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = tmp;
      }
    }
  }
  return array;
}
sort(unsortedarr);
console.log(unsortedarr);

//Q8
arr=[1,2,3,4,5,6];
var reversedArray = new Array();
arr.forEach((i)=>{
    reversedArray.unshift(i);
})
console.log(reversedArray);

//Q8 ends here

//Q9
arr=[1,2,3,4,5,6];
console.log(arr.indexOf(4));
//Q9 ends here