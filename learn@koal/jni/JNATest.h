#ifdef JNATEST_EXPORTS
#define JNATEST_API __declspec(dllexport)
#else
#define JNATEST_API __declspec(dllimport)
#endif

extern "C" {
	JNATEST_API void set(long l);
	JNATEST_API long get();
}