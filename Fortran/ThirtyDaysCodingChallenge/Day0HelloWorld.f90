program solution
	implicit none
	
	character(len=100) :: text
	
	read(*,"(a)") text
	write(*,"(a)") "Hello, World."
	write(*, "(a)", advance="no") text
	
end program solution