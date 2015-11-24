#include <cstdio>

int main(int argc, char** argv) {
    while (true) {
        if (argc > 1) {
            printf("%s\n", argv[1]);
        } else {
            printf("y\n");
        }
    }

    return 0;
}
