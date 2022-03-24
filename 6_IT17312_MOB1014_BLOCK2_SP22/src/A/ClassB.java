/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author dungna29
 */
public class ClassB {
   void method1(){
       ClassA c = new ClassA();
       //c.a; Vì a đã bị private
       c.b = 2;
       c.c = 2;
       c.d = 2;
   }
}
