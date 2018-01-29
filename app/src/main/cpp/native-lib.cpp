#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_cambricon_demoapk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_cambricon_demoapk_activity_MainActivity_stringFromJNI(JNIEnv *env) {

    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}extern "C"

JNIEXPORT jstring JNICALL
Java_com_cambricon_demoapk_common_JniUtil_stringFromJNI(JNIEnv *env, jobject instance) {

    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());

}