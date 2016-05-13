#include "stdafx.h"
#include "JNATest.h"

long tmp;
JNATEST_API void set(long l){
	tmp = l;
}
JNATEST_API long get(){
	return tmp;
}
