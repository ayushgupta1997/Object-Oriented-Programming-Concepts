/*Rules of virtual functions
 *Must be declared in public section of class, cannot be static
 *Accessed using pointer or reference to base class, to achieve runtime polymorphism
 *defined in base class @overridden in derived class
 *there is no virtual constructor, but there can be virtual destructor
 * In Java Concepts' Implementation will be different
*/

// sample program to show run-time polymorphism
#include <iostream>

using namespace std;

class base{
public:
    virtual void print() {
        cout << "in base class\n";
    }
    virtual void show() {
        cout << "show base class\n";
    }
};

class derived:public base {
public:
    void print() {
        cout << "print derived class\n";
    }

    void show() {
        cout << "show derived class\n";
    }
};

int main() {
    base *bptr;
    derived d; // object of derived class
    bptr = &d;
    bptr->print();
    bptr->show();
    return 0;
}
