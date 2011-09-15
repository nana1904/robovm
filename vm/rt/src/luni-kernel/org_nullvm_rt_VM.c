#include <nullvm.h>

ObjectArray* Java_org_nullvm_rt_VM_getStackClasses(Env* env, Class* c, jint skipNum, jint maxDepth) {
    CallStackEntry* first = nvmGetCallStack(env);
    if (!first) return NULL;
    first = first->next; // Skip VM.getStackClasses()
    if (!first) return NULL;
    first = first->next; // Skip caller of VM.getStackClasses()
    if (!first) return NULL;

    while (skipNum > 0) {
        first = first->next; // Skip
        if (!first) return NULL;
        skipNum--;
    }

    jint depth = 0;
    CallStackEntry* entry = first;
    while (entry) {
        depth++;
        entry = entry->next;
    }
    if (maxDepth > -1 && maxDepth < depth) {
        depth = maxDepth;
    }
    
    ObjectArray* result = nvmNewObjectArray(env, depth, java_lang_Class, NULL, NULL);
    if (!result) return NULL;
    jint i;
    entry = first;
    for (i = 0; i < depth; i++) {
        result->values[i] = (Object*) entry->method->clazz;
        entry = entry->next;
    }
    return result;
}

Object* Java_org_nullvm_rt_VM_intern(Env* env, Class* c, Object* string) {
    return nvmInternString(env, string);
}

ClassLoader* Java_org_nullvm_rt_VM_getBootClassLoader(Env* env, Class* c) {
    Class* holder = nvmFindClass(env, "java/lang/ClassLoader$BootClassLoaderHolder");
    if (!holder) return NULL;
    ClassField* field = nvmGetClassField(env, holder, "loader", "Ljava/lang/ClassLoader;");
    if (!field) return NULL;
    return (ClassLoader*) nvmGetObjectClassFieldValue(env, holder, field);
}

jlong Java_org_nullvm_rt_VM_getObjectAddress(Env* env, Class* c, Object* object) {
    return (jlong) object;
}
    
jint Java_org_nullvm_rt_VM_getInstanceFieldOffset(Env* env, Class* c, jlong fieldPtr) {
    InstanceField* field = (InstanceField*) fieldPtr;
    return field->offset;
}

jlong Java_org_nullvm_rt_VM_getClassFieldAddress(Env* env, Class* c, jlong fieldPtr) {
    ClassField* field = (ClassField*) fieldPtr;
    return (jlong) field->address;
}
    
Object* Java_org_nullvm_rt_VM_getObject(Env* env, Class* c, jlong address) {
    return *((Object**) address);
}

jdouble Java_org_nullvm_rt_VM_getDouble(Env* env, Class* c, jlong address) {
    return *((jdouble*) address);
}

jfloat Java_org_nullvm_rt_VM_getFloat(Env* env, Class* c, jlong address) {
    return *((jfloat*) address);
}

jlong Java_org_nullvm_rt_VM_getLong(Env* env, Class* c, jlong address) {
    return *((jlong*) address);
}

jint Java_org_nullvm_rt_VM_getInt(Env* env, Class* c, jlong address) {
    return *((jint*) address);
}

jchar Java_org_nullvm_rt_VM_getChar(Env* env, Class* c, jlong address) {
    return *((jchar*) address);
}

jshort Java_org_nullvm_rt_VM_getShort(Env* env, Class* c, jlong address) {
    return *((jshort*) address);
}

jbyte Java_org_nullvm_rt_VM_getByte(Env* env, Class* c, jlong address) {
    return *((jbyte*) address);
}

jboolean Java_org_nullvm_rt_VM_getBoolean(Env* env, Class* c, jlong address) {
    return *((jboolean*) address);
}

void Java_org_nullvm_rt_VM_setObject(Env* env, Class* c, jlong address, Object* value) {
    *((Object**) address) = value;
}

void Java_org_nullvm_rt_VM_setDouble(Env* env, Class* c, jlong address, jdouble value) {
    *((jdouble*) address) = value;
}

void Java_org_nullvm_rt_VM_setFloat(Env* env, Class* c, jlong address, jfloat value) {
    *((jfloat*) address) = value;
}

void Java_org_nullvm_rt_VM_setLong(Env* env, Class* c, jlong address, jlong value) {
    *((jlong*) address) = value;
}

void Java_org_nullvm_rt_VM_setInt(Env* env, Class* c, jlong address, jint value) {
    *((jint*) address) = value;
}

void Java_org_nullvm_rt_VM_setChar(Env* env, Class* c, jlong address, jchar value) {
    *((jchar*) address) = value;
}

void Java_org_nullvm_rt_VM_setShort(Env* env, Class* c, jlong address, jshort value) {
    *((jshort*) address) = value;
}

void Java_org_nullvm_rt_VM_setByte(Env* env, Class* c, jlong address, jbyte value) {
    *((jbyte*) address) = value;
}

void Java_org_nullvm_rt_VM_setBoolean(Env* env, Class* c, jlong address, jboolean value) {
    *((jboolean*) address) = value;
}
