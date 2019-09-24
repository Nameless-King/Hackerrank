#include <iostream>
#include <sstream>
#include <vector>

std::vector<int> parseInts(std::string str){
	int a;
	char ch;
	std::vector<int> vec_int;
	std::stringstream s_stream(str);
	while(s_stream >> a){
		vec_int.push_back(a);
		s_stream >> ch;
	}
	return vec_int;
	
}

int main(){
	std::string str;
	std::cin >> str;
	std::vector<int> integers = parseInts(str);
	for(int i = 0;i < integers.size(); i++){
		std::cout << integers[i] << "\n";
	}
	return 0;
}

