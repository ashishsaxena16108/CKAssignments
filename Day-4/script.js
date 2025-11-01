const print=(num,val)=>document.body.innerText+=`\nQ${num}.Ans ${val}\n`;
//Q1.
const add = (a,b)=>a+b;
var a=1;
var b=2;
print(1,`${a}+${b}=${add(a,b)}`);
//Q1 ends here

//Q2.
const greet=(name,message="Welcome!")=>{
    print(2,`${name} ${message}`);
}
greet("Ashish");
greet("Ashish","Good Morning!");
greet("Shyam",null);
greet("Shyam",undefined);
//Q2.ends here

//Q3.
const formatString = (name,age)=>{
   return `Hello,my name is ${name},and I am ${age} years old.`;
}
print(3,formatString("Ram","45"));
//Q3. ends here

//Q4.
const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};

(function extract(p){
   const {name,address,address:{city}} = p;
   print(4,`${name} lives in ${city} \n Address:${JSON.stringify(address)}`);
})(person)

//Q4 ends here

//Q5.
function sumAll(...rest){
    return rest.reduce((i,j)=>i+j);
}
print(5,sumAll(1,2,3,44,34));
//Q5. ends here

//Q6.
const filterEvens=arr=>arr.filter(i=>i%2===0);
var arr = [1,34,67,87,90,2,38];
print(6,'Original Array:'+JSON.stringify(arr)+'\nModified Array:'+JSON.stringify(filterEvens(arr)));
//Q6. ends here

//Q7.
const doubleValues=arr=>arr.map(i=>i*2);
print(7,'Original Array:'+JSON.stringify(arr)+'\nModified Array:'+JSON.stringify(doubleValues(arr)));
//Q7. ends here

//Q8.
const findMax = (arr)=>Math.max(...arr);
print(8,'Original Array:'+JSON.stringify(arr)+'\nMax:'+JSON.stringify(findMax(arr)));
//Q8. ends here

//Q9.
const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]

const [{age}=first,{name}=second] = data;
print(9,`Name:${name}\n Age:${age}`);
//Q9. ends here

//Q10.
const manipulateData = (arr)=>{
   return arr.map((item)=>{
      const {id,title,rating:{rate,count}} = item;
      return JSON.stringify({id,title,rate,count});
   })
}
const products = [{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"price": 109.95,
"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
"category": "men's clothing",
"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
"rating": {
"rate": 3.9,
"count": 120
}
}]
print(10,manipulateData(products));
//Q10. ends here

//Q11.
print(11,'Answer will be else <empty string>')
//Q11. ends here

//Q12.
const deepClone = (obj)=>{
   return JSON.parse(JSON.stringify(obj));
}
const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c);
print(12,obj.b.c);
//Q12. ends here

//Q13.
const nestedArray = [[1,[2,[3,[4,5]]]]];
const flattenArray=(nestedArray)=>{
    const res=[];
    for(item of nestedArray){
        if(Array.isArray(item)===true){
           res.push(...flattenArray(item));
        }
        else{
            res.push(item);
        }
    }
    return res;
}
print(13,`Original Array:${JSON.stringify(nestedArray)} \nFlatten Array:${JSON.stringify(flattenArray(nestedArray))}`);
