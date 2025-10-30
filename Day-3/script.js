function Product(name,price,category){
     this.name=name;
     this.price=price;
     this.category=category;
   }
function max(){
    return this.reduce((a,b)=>{return a.price>b.price?a:b});
}
function animationOut(div){
    div.style.transition = "width 0.5s ease, height 0.5s ease, font-size 0.5s ease";
    div.style.width = "550px";
    div.style.height="250px";
    div.style["font-size"]="20px"
}
function animationIn(div){
    div.style.transition = "width 0.5s ease, height 0.5s ease, font-size 0.5s ease";
    div.style.width = "500px";
    div.style.height="190px" 
    div.style["font-size"]="16px"
}
(function(){
   var arr = [];
   arr.push(new Product("Pencil",23,"Stationary"));
   arr.push(new Product("Eraser",19,"Stationary"));
   arr.push(new Product("Table",200,"Furniture"));
   arr.push(new Product("Chair",140,"Furniture"));
   var maxProduct = max.apply(arr);
   Product.prototype.getDiscountedPrice=(percent)=>{
      return (this.price*percent)/100;
   }
   document.body.insertAdjacentHTML('afterbegin',`<h1>The costliest product is ${maxProduct.name} with price ${maxProduct.price}`);
   arr.forEach((product)=>{
      var div = document.createElement("div");
      var h=document.createElement("h1");
      var p = document.createElement("h2");
      var c = document.createElement("h3");
      h.innerText=`Product Name : ${product.name}`;
      h.addEventListener("mouseover",()=>{
        h.style.transition="background-color 0.5s ease";
        h.style.backgroundColor="yellow";
      });
      h.addEventListener("mouseout",()=>{
        h.style.transition="background-color 0.5s ease";
        h.style.backgroundColor="white";
      });
      
      p.innerText=`Price : ${product.price}`;
      p.addEventListener("mouseover",()=>{
        p.style.transition="background-color 0.5s ease";
        p.style.backgroundColor="yellow";
      });
      p.addEventListener("mouseout",()=>{
        p.style.transition="background-color 0.5s ease";
        p.style.backgroundColor="white";
      });
      c.innerText=`Category : ${product.category}`;
      c.addEventListener("mouseover",()=>{
        c.style.transition="background-color 0.5s ease";
        c.style.backgroundColor="yellow";
      });
      c.addEventListener("mouseout",()=>{
        c.style.transition="background-color 0.5s ease";
        c.style.backgroundColor="white";
      });
      div.append(h,p,c);
      div.addEventListener("mouseover",()=>{
        animationOut(div);
      });
      div.addEventListener("mouseout",()=>{
        animationIn(div);
      });
      document.body.appendChild(div);
   });
})()