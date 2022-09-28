let fname='Anil',
lname='kumar';

let user= {
    fname,
    lname
};

console.log(user.fname);
console.log(user.lname);

var department='dep_name';
var emp={
    id:102,
    name:'Anil', 
    [department]:'Production'
}
console.log(emp);