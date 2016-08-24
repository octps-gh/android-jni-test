#include <string.h>
#include <jni.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_markzhang_markimgjni_1demo_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("Hello from JNI!");
}