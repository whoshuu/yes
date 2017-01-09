#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    while (true) {
        if (argc > 1) {
            cout << argv[1] << endl;
        } else {
            cout << "y" << endl;
        }
    }
    return 0;
}
