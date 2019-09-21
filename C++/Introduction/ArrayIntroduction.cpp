#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

int main(){
	int size;
	std::cin >> size;
	int arr[size];
	
	for(int i = 0;i<size;i++){
		std::cin >> arr[i];
	}
	
	for(int i = size - 1;i>=0;i--){
		std::cout << arr[i] << " " << std::flush;
	}
	return 0;
}
