#include <iostream>
#include <string>

int main(){
	std::string s1;
	std::string s2;
	
	std::cin >> s1;
	std::cin >> s2;
	
	std::cout << s1.length() << " " << s2.length() << std::endl;
	std::cout << s1 << s2 << std::endl;
	std::cout << s2.at(0) << s1.substr(1) << " " << s1.at(0) << s2.substr(1) << std::endl;
	
	return 0;
}