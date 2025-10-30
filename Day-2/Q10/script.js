var addButton = document.getElementById('add-btn');
var tableBody = document.getElementById('table-body');
function addDetails(){
    var name = prompt("Enter your name");
    if(name === null || name===""){
      alert('Name cannot be empty');
      return;
    }
    var englishMarks = prompt("Enter marks in English");
    if(isNaN(englishMarks) || englishMarks<0 || englishMarks>100){
        alert('Enter number between 0 and 100.');
        return;
    }
    var hindiMarks = prompt("Enter marks in Hindi");
    if(isNaN(hindiMarks) || hindiMarks<0 || hindiMarks>100){
        alert('Enter number between 0 and 100.');
        return;
    }
    var mathMarks = prompt("Enter marks in Maths");
    if(isNaN(mathMarks) || mathMarks<0 || mathMarks>100){
        alert('Enter number between 0 and 100.');
        return;
    }
    var scienceMarks = prompt("Enter marks in Science");
    if(isNaN(scienceMarks) || scienceMarks<0 || scienceMarks>100){
        alert('Enter number between 0 and 100.');
        return;
    }
    var sstMarks = prompt("Enter marks in Social Science");
    if(isNaN(sstMarks) || sstMarks<0 || sstMarks>100){
        alert('Enter number between 0 and 100.');
        return;
    }
    var totalMarks = parseInt(englishMarks)+parseInt(hindiMarks)+parseInt(mathMarks)+parseInt(scienceMarks)+parseInt(sstMarks);
    var averageMarks = totalMarks/5;
    var body = tableBody.innerHTML;
    tableBody.innerHTML=body+`<tr><td>${name}</td>
                                <td>${englishMarks}</td>
                                <td>${hindiMarks}</td>
                                <td>${mathMarks}</td>
                                <td>${scienceMarks}</td>
                                <td>${sstMarks}</td>
                                <td>${totalMarks}</td>
                                <td>${averageMarks}</td></tr>`;
}
addButton.addEventListener('click',()=>{
    addDetails();
});