var Employee = /** @class */ (function () {
    function Employee(id, name, email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    return Employee;
}());
var employee1 = new Employee(101, 'Harsh', 'harsh@yahoo.com');
console.log(employee1);
