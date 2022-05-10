//enum v {car,truck,bus}
abstract class Car {
    static int i=0;
    static Car[] mas=new Car[10];
    private String reg_number="Отсутствует";
    private final String brand;
  //  private final v view;
    private String color;
    //private int power;
    private Engine engine;
    private final int num_of_wheels;
    public  Car(String brand,String color, Engine engine, int num_of_wheels){ //(v view)
        this.brand=brand;
       // this.view=view;
        this.color=color;
        //this.power=power;
        this.engine=engine;
        this.num_of_wheels=num_of_wheels;
        mas[i]=this;
        i++;
    }
    public Car(String number,String brand, String color, Engine engine, int num_of_wheels){// v view
        this.brand=brand;
      //  this.view=view;
        this.color=color;
        //this.power=power;
        this.engine=engine;
        this.num_of_wheels=num_of_wheels;
        this.reg_number=number;
    }

    final void  setReg_number(String reg_number){
        this.reg_number = reg_number;
    }
    final void setColor(String color){
        this.color = color;
    }
    final void setEngine(Engine engine){
        this.engine = engine;
    }
    final String getBrand(){
        return brand;
    }
    final String getReg_number(){
        return reg_number;
    }
    final String getColor(){
        return color;
    }
    final Engine getEngine(){
        return engine;
    }
    final int getNum_of_wheels(){
        return num_of_wheels;
    }
    final void ChangeColor(String color){
        this.color=color;
    }
    //void ChangePower(int power){
    //        this.power=power;
    //    }
    final void ChangeEngine(Engine engine){
        this.engine=engine;
    }
    void ChangeNumber(String number){
        if (number.matches("^([АБЕКМНОРСТУХABEKMHOPCTYX][\\s]?)[0-9]{3}[\\s]?[АБЕКМНОРСТУХABEKMHOPCTYX]{2}[\\s]?([0-9]{2,3})[\\s]?[A-Z]{3}$"))
            this.reg_number=number;
        else System.out.println("Номер задан неправильно");
    }
    void Info(){
        System.out.println("Информация о машине: ");
     //   System.out.println("Вид: "+view);
        System.out.println("Регистрационный номер: "+reg_number);
        System.out.println("Марка: "+brand);
        //System.out.println("Мощность двигателя: "+power+" л.с.");
        System.out.println("Количество колёс: "+num_of_wheels);
        System.out.println("Цвет: "+color);
        engine.printInfo();
        System.out.println();
    }
}
class Engine {
    private String serial_number = "";
    private double fuel_rate;
    private String fuel_type;
    private int power;
    private double capacity;
    private int cylinders_num;
    private double torque;
    private int max_speed;

    public Engine(double fuel_rate, String fuel_type, int power, double capacity, int cylinders_num, double torque, int max_speed) {
        this.fuel_rate = fuel_rate;
        this.fuel_type = fuel_type;
        this.power = power;
        this.capacity = capacity;
        this.cylinders_num = cylinders_num;
        this.torque = torque;
        this.max_speed = max_speed;
    }

    public Engine(String serial_number, double fuel_rate, String fuel_type, int power, double capacity, int cylinders_num, double torque, int max_speed) {
        this.serial_number = serial_number;
        this.fuel_rate = fuel_rate;
        this.fuel_type = fuel_type;
        this.power = power;
        this.capacity = capacity;
        this.cylinders_num = cylinders_num;
        this.torque = torque;
        this.max_speed = max_speed;
    }

    void ChangeSNum(String serial_number) {
        this.serial_number = serial_number;
    }

    void ChangeFuelRate(double fuel_rate) {
        this.fuel_rate = fuel_rate;
    }

    void ChangeFuelType(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    void ChangePower(int power) {
        this.power = power;
    }

    void ChangeCapacity(double capacity) {
        this.capacity = capacity;
    }

    void ChangeCylNum(int cylinders_num) {
        this.cylinders_num = cylinders_num;
    }

    void ChangeTorque(double torque) {
        this.torque = torque;
    }

    void ChangeMaxSpeed(int max_speed) {
        this.max_speed = max_speed;
    }
        void printInfo(){
            System.out.println("Характеристики двигателя: ");
            System.out.println("Серийный номер: № "+serial_number);
            System.out.println("Расход топлива: "+fuel_rate+" л/100 км");
            System.out.println("Тип топлива: "+fuel_type);
            System.out.println("Мощность: "+power+" л.с.");
            System.out.println("Обьем: "+capacity+" л");
            System.out.println("Количество цилиндров: "+cylinders_num);
            System.out.println("Крутящий момент: "+torque+" Нм");
            System.out.println("Максимальное число оборотов: "+max_speed+" об/мин");
            System.out.println();
        }
    }


class Pass_Car extends Car{
String type;
String transmission;
int max_speed;
    public Pass_Car(String brand, String color, Engine engine, int num_of_wheels,String type,String transmission,int max_speed){
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        setColor(color);
        setEngine(engine);
        this.type=type;
        this.transmission=transmission;
        this.max_speed=max_speed;

    }

    public Pass_Car(String reg_number,String brand, String color, Engine engine, int num_of_wheels,String type,String transmission,int max_speed) {
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        setReg_number(reg_number);
        setColor(color);
        setEngine(engine);
        this.type=type;
        this.transmission=transmission;
        this.max_speed=max_speed;

    }
    @Override void Info(){
        System.out.println("Информация о машине: ");
        //   System.out.println("Вид: "+view);
        System.out.println("Регистрационный номер: "+getReg_number());
        System.out.println("Марка: "+getBrand());
        //System.out.println("Мощность двигателя: "+power+" л.с.");
        System.out.println("Количество колёс: "+getNum_of_wheels());
        System.out.println("Цвет: "+getColor());
        System.out.println("Тип: "+type);
        System.out.println("Коробка передач: "+transmission);
        System.out.println("Максимальная скорость: "+max_speed);
        getEngine().printInfo();
        System.out.println();
    }
}
class Truck extends Car {
    private int weight;
    private int lifting_capacity;
    private int cabin;
    String dimensions;

    public Truck(String brand, String color, Engine engine, int num_of_wheels, int weight, int lifting_capacity, int cabin, String dimensions) {
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        this.lifting_capacity = lifting_capacity;
        this.weight = weight;
        this.cabin = cabin;
        this.dimensions = dimensions;
    }
    public Truck(String reg_number,String brand, String color, Engine engine, int num_of_wheels, int weight, int lifting_capacity, int cabin, String dimensions) {
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        setReg_number(reg_number);
        this.lifting_capacity = lifting_capacity;
        this.weight = weight;
        this.cabin = cabin;
        this.dimensions = dimensions;
    }
    @Override void Info(){
        System.out.println("Информация о машине: ");
        //   System.out.println("Вид: "+view);
        System.out.println("Регистрационный номер: "+getReg_number());
        System.out.println("Марка: "+getReg_number());
        //System.out.println("Мощность двигателя: "+power+" л.с.");
        System.out.println("Количество колёс: "+getNum_of_wheels());
        System.out.println("Цвет: "+getColor());
        System.out.println("Грузподъемность: "+lifting_capacity);
        System.out.println("Вес: "+weight);
        System.out.println("Мест в кабине: "+cabin);
        System.out.println("Размеры: "+dimensions);
        getEngine().printInfo();
        System.out.println();
    }
}
class Bus extends Car{
    final int space;
    final String dimensions;
    public Bus(String brand, String color, Engine engine, int num_of_wheels,int space,String dimensions){
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        this.space=space;
        this.dimensions=dimensions;

    }
    public Bus(String reg_number,String brand, String color, Engine engine, int num_of_wheels,int space,String dimensions){
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        setReg_number(reg_number);
        this.space=space;
        this.dimensions=dimensions;

    }
    @Override void Info(){
        System.out.println("Информация о машине: ");
        //   System.out.println("Вид: "+view);
        System.out.println("Регистрационный номер: "+getReg_number());
        System.out.println("Марка: "+getReg_number());
        //System.out.println("Мощность двигателя: "+power+" л.с.");
        System.out.println("Количество колёс: "+getNum_of_wheels());
        System.out.println("Цвет: "+getColor());
        System.out.println("Количество мест: "+space);
        System.out.println("Размеры: "+dimensions);
        getEngine().printInfo();
        System.out.println();
    }
}
class FireTruck extends Car{
    private int weight;
    int space;
    String passability;
    public FireTruck(String brand, String color, Engine engine, int num_of_wheels,int weight,int space,String Passability){
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        this.weight=weight;
        this.space=space;
        this.passability=passability;
        setColor("Red");
    }
    public FireTruck(String reg_number,String brand, String color, Engine engine, int num_of_wheels,int weight,int space,String Passability){
        super(brand, color, engine, num_of_wheels);
        //this.view=view;
        //this.power=power;
        setReg_number(reg_number);
        this.weight=weight;
        this.space=space;
        this.passability=passability;
        setColor("Red");
    }
    @Override void Info(){
        System.out.println("Информация о машине: ");
        //   System.out.println("Вид: "+view);
        System.out.println("Регистрационный номер: "+getReg_number());
        System.out.println("Марка: "+getReg_number());
        //System.out.println("Мощность двигателя: "+power+" л.с.");
        System.out.println("Количество колёс: "+getNum_of_wheels());
        System.out.println("Цвет: "+getColor());
        System.out.println("Вес: "+weight);
        System.out.println("Количество мест: "+space);
        System.out.println("Проходимость: "+passability);
        getEngine().printInfo();
        System.out.println();
    }
    @Override void ChangeNumber(String number){
        if (number.matches("^([АБЕКМНОРСТУХABEKMHOPCTYX]{2}[\\s]?)[0-9]{4}[\\s]?[5]{2}[A-Z]{3}$"))
                    this.setReg_number(number);
        else System.out.println("Номер задан неправильно");
    }
    }

class Motor_depot{

    int k;
    int j = 0;
    public Motor_depot(int i){
        this.k = i;
    }

    void Free_Places(){
        System.out.println("Свободных мест осталость: " + (k-j));
    }

    Car[] mas = new Car[5];
    String[] status = new String[5];
    int[] Space = new int[]{1,2,3,4,5};

    void addCar(Car s){
        if (k == j){
            System.out.println("Место закончилось");
        }
        else{
            for (int i = 0; i < 5; i++){
                if (Space[i] != 0){
                    mas[i] = s;
                    status[i] = "Свободен";
                    Space[i] = 0;
                    j += 1;
                    break;
                }
            }
        }
    }
    void deleteCar(int i){
        i -= 1;
        mas[i] = null;
        status[i] = "Списан";
        j -= 1;
        Space[i] = i+1;
    }
    void For_Flight(int i){
        i -= 1;
        if (status[i] == "Свободен")
            status[i] = "В рейсе";
    }
    void Vozvrashenie(int i){
        i -= 1;
        status[i] = "Свободен";
    }
    void For_Repairs(int i){
        i -= 1;
        status[i] = "На ремонте";
    }

    void print_Motor_depotAll(){
        System.out.println("\nСвободные машины: ");
        for (int i = 0; i<k;i++){
            if (mas[i] != null){
                if (status[i] == "Свободен"){
                    System.out.println(mas[i].getBrand() + " " + (i+1));
                }
            }
        }
        System.out.println("\nМашины в ремонте: ");
        for (int i = 0; i<k;i++){
            if (mas[i] != null){
                if (status[i] == "На ремонте"){
                    System.out.println(mas[i].getBrand() + " " + (i+1));
                }
            }
        }
        System.out.println("\nМашины в рейсе: ");
        for (int i = 0; i<k;i++){
            if (mas[i] != null){
                if (status[i] == "В рейсе"){
                    System.out.println(mas[i].getBrand() + " " + (i+1));
                }
            }
        }
    }
}

class Complex{
    private double x;
    private double y=0;

    Complex(double x, double y){
        this.x=x;
        this.y=y;
    }
    Complex(){}
    Complex(double x){this.x=x;}
    void Real(){
        System.out.println(x);
    }
    void Imaginary(){
        System.out.println("i*"+y);
    }
    void AlgForm() {
        System.out.println("Алгебраическая форма: ");
        System.out.println(x+"+i*"+y);
    }
    void TrigForm() {
        System.out.println("Тригонометрическая форма: ");
        double r=Math.sqrt(x*x+y*y);
        double FI = Math.atan(y/x);
        System.out.printf("%.2f *(cos(%.2f)+ isin(%.2f))",r,FI,FI);
        System.out.println();
    }
    static boolean Compare(Complex z1, Complex z2){
        return z1.x == z2.x && z1.y == z2.y;
    }
    static Complex Sum(Complex z1, Complex z2){
        Complex z3 = new Complex();
        z3.x=z1.x+ z2.x;
        z3.y=z1.y+ z2.y;
        //z3.alg_form();
        return z3;
    }
    static Complex Diff(Complex z1, Complex z2){
        Complex z3 = new Complex();
        z3.x=z1.x- z2.x;
        z3.y=z1.y- z2.y;
        //z3.alg_form();
        return z3;
    }
    static Complex Mult(Complex z1, Complex z2){
        Complex z3 = new Complex();
        z3.x=z1.x* z2.x-z1.y* z2.y;
        z3.y=z1.y* z2.x+z1.x*z2.y;
        //z3.alg_form();
        return z3;
    }
    static Complex Div(Complex z1, Complex z2){
        Complex z3 = new Complex();
        z3.x=(z1.x*z2.x+z1.y*z2.y)/(z2.x*z2.x+z2.y*z2.y);
        z3.y=(z1.y*z2.x+z1.x*z2.y)/(z2.x*z2.x-z2.y*z2.y);
        //z3.alg_form();
        return z3;
      //  System.out.printf("%.2f + i * %.2f",(z1.x*z2.x+z1.y*z2.y)/(z2.x*z2.x+z2.y*z2.y),(z1.y*z2.x+z1.x*z2.y)/(z2.x*z2.x-z2.y*z2.y));
      //  System.out.println();
    }

    Complex conjugate(){y=-y; return new Complex(x,y);}
    static Complex exp(Complex z){
        return new Complex(Math.exp(z.x)*Math.cos(z.y),Math.exp(z.x)*Math.sin(z.y));
    }
    static Complex sin(Complex z){
        return new Complex(Math.sin(z.x) * Math.cosh(z.y), Math.cos(z.x) * Math.sinh(z.y));
    }
     static Complex cos(Complex z){
        return new Complex(Math.cos(z.x) * Math.cosh(z.y), -Math.sin(z.x) * Math.sinh(z.y));
    }
    public static Complex tan(Complex z){return Div(sin(z),cos(z));}
    public static Complex arctan(Complex z){
        return Div(cos(z),sin(z));
    }
    public static Complex sh(Complex z) {return Div(Diff(exp(z),exp(z.conjugate())),new Complex(2,0));}
    public static Complex ch(Complex z){return Div(Sum(exp(z),exp(z.conjugate())),new Complex(2,0));}
    public static Complex th (Complex z) {return Div(sh(z),ch(z));}
    public static Complex cth (Complex z) {return Div(ch(z),sh(z));}
}
public class Lab4 {
    public static void main(String[] args){

       // Car Land_Cruiser = new Car ("Toyota",v.car,"White",300,4);
        Engine engine=new Engine(10.1,"Бензин",415,3.3,6,650,5200);
        engine.ChangeCapacity(3.5);
        engine.printInfo();
        Pass_Car Land_Cruiser = new Pass_Car("Toyota","Белый",engine,4,"Внедорожник","Автоматическая",210);
        Land_Cruiser.Info();
        Land_Cruiser.ChangeNumber("X156YH76RUS");
        Land_Cruiser.ChangeColor("Зеленый");
       // Land_Cruiser.ChangePower(350);
        Land_Cruiser.Info();
        Pass_Car BMW_X5 = new Pass_Car ("BMW","Черный",engine,4,"Внедорожник","Автоматическая",220);
        Pass_Car Mercedes_C200 = new Pass_Car ("Mercedes","Белый",engine,4,"Седан","Автоматическая",210);
        Pass_Car Audi_A5 = new Pass_Car ("Audi","Белый",engine,4,"Автоматическая","Хетчбэк",240);
        Pass_Car Kia_Rio = new Pass_Car ("Kia","Белый",engine,4,"Автоматическая","Седан",225);
        Pass_Car Lexus_rx507 = new Pass_Car ("Hyundai","Черный",engine,4,"Автоматическая","Внедорожник",200);
        Pass_Car Nissan_Quaskai = new Pass_Car ("Nissan ","Красный",engine,4,"Автоматическая","Внедорожник",230);
        //String reg_number,String brand, String color, Engine engine, int num_of_wheels,String type,String transmission,int max_speed
        System.out.println("Задание 2");
        Complex z1 = new Complex(10,3);
        Complex z2 = new Complex(7,2);
        z1.Real();
        z1.Imaginary();
        z2.Real();
        z2.Imaginary();
        z1.AlgForm();
        z1.TrigForm();
        System.out.println(Complex.Compare(z1,z2));
        Complex.Sum(z1,z2);
        Complex.Diff(z1,z2);
        Complex.Mult(z1,z2);
        Complex.Div(z1,z2);
        System.out.println("Задание 3");

        System.out.println("Задание 7");
        Motor_depot Test = new Motor_depot(5);
        Test.addCar(Land_Cruiser);
        Test.addCar(BMW_X5);
        Test.addCar(Mercedes_C200);
        Test.addCar(Audi_A5);
        Test.addCar(Kia_Rio);
        Test.addCar(Lexus_rx507);
        Test.print_Motor_depotAll();
        Test.Free_Places();
        Test.For_Flight(2);
        Test.Vozvrashenie(1);
        Test.For_Repairs(1);
        Test.For_Repairs(3);
        Test.Vozvrashenie(1);
        Test.deleteCar(1);
        Test.addCar(Nissan_Quaskai);
        Test.print_Motor_depotAll();
        Test.Free_Places();
    }
}
