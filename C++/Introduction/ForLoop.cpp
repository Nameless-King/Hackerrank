#include <iostream>
#include <cstdio>
#include <string>

int main(){
	int a,b;
	cin >> a;
	cin >> b;
	string sArray[10] = {"one","two","three","four","five","six","seven","eight","nine"};
	for(int i = a;i<=b;i++){
		if( i > 0 && i < 10){
			std::cout << sArray[i - 1] << std::endl;
		}else{
			if(i%2 == 0){
				std::cout << "even" << std::endl;
			}else{
				std::cout << "odd" << std::endl;
			}
		}
	}
	return 0;
}