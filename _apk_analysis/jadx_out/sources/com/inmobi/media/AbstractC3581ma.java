package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3581ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27615a = 0;

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z10;
        String name = field.getName();
        try {
            z10 = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z10 = jSONObject.getInt(name) != 0;
        }
        return Boolean.valueOf(z10);
    }

    public static Object a(JSONArray jSONArray, int i10, Class cls) {
        Object objValueOf = tn.p.f(Integer.TYPE, cls) ? Integer.valueOf(jSONArray.getInt(i10)) : tn.p.f(Double.TYPE, cls) ? Double.valueOf(jSONArray.getDouble(i10)) : tn.p.f(Float.TYPE, cls) ? Float.valueOf((float) jSONArray.getDouble(i10)) : tn.p.f(Long.TYPE, cls) ? Long.valueOf(jSONArray.getLong(i10)) : tn.p.f(Byte.TYPE, cls) ? Byte.valueOf((byte) jSONArray.getInt(i10)) : tn.p.f(Short.TYPE, cls) ? Short.valueOf((short) jSONArray.getInt(i10)) : jSONArray.get(i10);
        tn.p.h(objValueOf);
        return objValueOf;
    }

    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) throws JSONException, IllegalAccessException {
        Constructor<?> constructor;
        cls.getSimpleName();
        cls.toString();
        Objects.toString(obj);
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                tn.p.h(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    obj2 = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i10];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        tn.p.j(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i10++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        obj2 = constructor.newInstance(new Object[0]);
                    } else {
                        Object[] objArr = new Object[length2];
                        Iterator itA = tn.b.a(constructor.getParameterTypes());
                        int i11 = 0;
                        while (itA.hasNext()) {
                            Class cls2 = (Class) itA.next();
                            int i12 = i11 + 1;
                            tn.p.h(cls2);
                            objArr[i11] = (tn.p.f(Integer.TYPE, cls2) || tn.p.f(Long.TYPE, cls2)) ? 0 : tn.p.f(Boolean.TYPE, cls2) ? Boolean.FALSE : (tn.p.f(Double.TYPE, cls2) || tn.p.f(Float.TYPE, cls2)) ? Double.valueOf(0.0d) : null;
                            i11 = i12;
                        }
                        obj2 = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e10) {
                e10.getMessage();
                cls.toString();
                return null;
            }
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            tn.p.h(superclass);
            obj2 = a(jSONObject, superclass, obj, obj2);
        }
        Iterator itA2 = tn.b.a(cls.getDeclaredFields());
        while (itA2.hasNext()) {
            Field field = (Field) itA2.next();
            field.setAccessible(true);
            String name = field.getName();
            if (!tn.p.f(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    Class<?> type = field.getType();
                    Class cls3 = Integer.TYPE;
                    if (tn.p.f(cls3, type) || tn.p.f(cls3, type) || tn.p.f(Integer.class, type)) {
                        tn.p.h(field);
                        d(field, obj2, jSONObject);
                    } else {
                        Class cls4 = Boolean.TYPE;
                        if (tn.p.f(cls4, type) || tn.p.f(cls4, type) || tn.p.f(Boolean.class, type)) {
                            tn.p.h(field);
                            a(field, obj2, a(jSONObject, field));
                        } else {
                            Class cls5 = Double.TYPE;
                            if (tn.p.f(cls5, type) || tn.p.f(cls5, type) || tn.p.f(Double.class, type)) {
                                tn.p.h(field);
                                b(field, obj2, jSONObject);
                            } else {
                                Class cls6 = Float.TYPE;
                                if (tn.p.f(cls6, type) || tn.p.f(cls6, type) || tn.p.f(Float.class, type)) {
                                    tn.p.h(field);
                                    c(field, obj2, jSONObject);
                                } else {
                                    Class cls7 = Long.TYPE;
                                    if (tn.p.f(cls7, type) || tn.p.f(cls7, type) || tn.p.f(Long.class, type)) {
                                        tn.p.h(field);
                                        e(field, obj2, jSONObject);
                                    } else {
                                        Class cls8 = Byte.TYPE;
                                        if (tn.p.f(cls8, type) || tn.p.f(cls8, type) || tn.p.f(Byte.class, type)) {
                                            tn.p.h(field);
                                            a(field, obj2, jSONObject);
                                        } else if (tn.p.f(String.class, type)) {
                                            field.set(obj2, jSONObject.getString(name));
                                        } else {
                                            Class cls9 = Short.TYPE;
                                            if (tn.p.f(cls9, type) || tn.p.f(cls9, type) || tn.p.f(Short.class, type)) {
                                                tn.p.h(field);
                                                f(field, obj2, jSONObject);
                                            } else if (tn.p.f(JSONObject.class, type)) {
                                                tn.p.h(field);
                                                JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                JSONObject jSONObject3 = new JSONObject();
                                                tn.p.k(field, "<this>");
                                                if (jSONObject2 == null) {
                                                    jSONObject2 = jSONObject3;
                                                }
                                                field.set(obj2, jSONObject2);
                                            } else if (tn.p.f(JSONArray.class, type)) {
                                                field.set(obj2, jSONObject.getJSONArray(name));
                                            } else if (Map.class.isAssignableFrom(type)) {
                                                JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                Objects.toString(jSONObject4);
                                                HashMap map = new HashMap();
                                                Iterator<String> itKeys = jSONObject4.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    tn.p.h(jSONObject4);
                                                    tn.p.h(next);
                                                    Type genericType = field.getGenericType();
                                                    tn.p.i(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                    Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[1];
                                                    tn.p.i(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                    Class cls10 = (Class) type2;
                                                    Object objValueOf = tn.p.f(Integer.TYPE, cls10) ? Integer.valueOf(jSONObject4.getInt(next)) : tn.p.f(Double.TYPE, cls10) ? Double.valueOf(jSONObject4.getDouble(next)) : tn.p.f(Float.TYPE, cls10) ? Float.valueOf((float) jSONObject4.getDouble(next)) : tn.p.f(Long.TYPE, cls10) ? Long.valueOf(jSONObject4.getLong(next)) : tn.p.f(Byte.TYPE, cls10) ? Byte.valueOf((byte) jSONObject4.getInt(next)) : tn.p.f(Short.TYPE, cls10) ? Short.valueOf((short) jSONObject4.getInt(next)) : jSONObject4.get(next);
                                                    tn.p.h(objValueOf);
                                                    if (objValueOf == null || !a(objValueOf.getClass())) {
                                                        JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                        tn.p.j(jSONObject5, "getJSONObject(...)");
                                                        Type genericType2 = field.getGenericType();
                                                        tn.p.i(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                        Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
                                                        tn.p.i(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                        objValueOf = a(jSONObject5, (Class) type3, null, null);
                                                    }
                                                    if (objValueOf != null) {
                                                        map.put(next, objValueOf);
                                                    }
                                                }
                                                field.set(obj2, map);
                                            } else if (List.class.isAssignableFrom(type)) {
                                                JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                tn.p.h(field);
                                                List linkedList = (tn.p.f(field.getType(), LinkedList.class) || tn.p.f(field.getType(), LinkedList.class)) ? new LinkedList() : new ArrayList();
                                                int length3 = jSONArray.length();
                                                for (int i13 = 0; i13 < length3; i13++) {
                                                    tn.p.h(jSONArray);
                                                    Type genericType3 = field.getGenericType();
                                                    tn.p.i(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                    Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[0];
                                                    tn.p.i(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                    Object objA = a(jSONArray, i13, (Class) type4);
                                                    if (objA == null || !a(objA.getClass())) {
                                                        JSONObject jSONObject6 = jSONArray.getJSONObject(i13);
                                                        tn.p.j(jSONObject6, "getJSONObject(...)");
                                                        Type genericType4 = field.getGenericType();
                                                        tn.p.i(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                        Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[0];
                                                        tn.p.i(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                        objA = a(jSONObject6, (Class) type5, null, null);
                                                    }
                                                    if (objA != null) {
                                                        linkedList.add(objA);
                                                    }
                                                }
                                                field.set(obj2, linkedList);
                                            } else if (type.isArray()) {
                                                JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                Class<?> componentType = type.getComponentType();
                                                int length4 = jSONArray2.length();
                                                Object objNewInstance = Array.newInstance(componentType, length4);
                                                for (int i14 = 0; i14 < length4; i14++) {
                                                    tn.p.h(jSONArray2);
                                                    tn.p.h(componentType);
                                                    Object objA2 = a(jSONArray2, i14, componentType);
                                                    if (objA2 == null || !a(objA2.getClass())) {
                                                        JSONObject jSONObject7 = jSONArray2.getJSONObject(i14);
                                                        tn.p.j(jSONObject7, "getJSONObject(...)");
                                                        objA2 = a(jSONObject7, componentType, null, null);
                                                    }
                                                    if (objA2 != null) {
                                                        Array.set(objNewInstance, i14, objA2);
                                                    }
                                                }
                                                field.set(obj2, objNewInstance);
                                            } else {
                                                JSONObject jSONObject8 = jSONObject.getJSONObject(name);
                                                Objects.toString(obj2);
                                                tn.p.h(jSONObject8);
                                                tn.p.h(type);
                                                field.set(obj2, a(jSONObject8, type, obj2, null));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field.isAnnotationPresent(Ue.class)) {
                    throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                }
            }
        }
        return obj2;
    }

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || tn.p.f(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                tn.p.h(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator itA = tn.b.a(cls.getDeclaredFields());
            while (itA.hasNext()) {
                Field field = (Field) itA.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                        tn.p.h(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !tn.p.f(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (tn.p.f(cls2, type) || tn.p.f(cls2, type) || tn.p.f(Integer.class, type)) {
                                Object obj2 = field.get(obj);
                                tn.p.i(obj2, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj2).intValue());
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (tn.p.f(cls3, type) || tn.p.f(cls3, type) || tn.p.f(Boolean.class, type)) {
                                    Object obj3 = field.get(obj);
                                    tn.p.i(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj3).booleanValue());
                                } else {
                                    Class cls4 = Double.TYPE;
                                    if (tn.p.f(cls4, type) || tn.p.f(cls4, type) || tn.p.f(Double.class, type)) {
                                        Object obj4 = field.get(obj);
                                        tn.p.i(obj4, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj4).doubleValue());
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (tn.p.f(cls5, type) || tn.p.f(cls5, type) || tn.p.f(Float.class, type)) {
                                            Object obj5 = field.get(obj);
                                            tn.p.i(obj5, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj5);
                                        } else {
                                            Class cls6 = Long.TYPE;
                                            if (tn.p.f(cls6, type) || tn.p.f(cls6, type) || tn.p.f(Long.class, type)) {
                                                Object obj6 = field.get(obj);
                                                tn.p.i(obj6, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj6).longValue());
                                            } else {
                                                Class cls7 = Byte.TYPE;
                                                if (tn.p.f(cls7, type) || tn.p.f(cls7, type) || tn.p.f(Byte.class, type)) {
                                                    Object obj7 = field.get(obj);
                                                    tn.p.i(obj7, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj7);
                                                } else if (tn.p.f(String.class, type) || tn.p.f(JSONObject.class, type) || tn.p.f(JSONArray.class, type)) {
                                                    jSONObject.put(name, field.get(obj));
                                                } else {
                                                    Class cls8 = Short.TYPE;
                                                    if (tn.p.f(cls8, type) || tn.p.f(cls8, type) || tn.p.f(Short.class, type)) {
                                                        Object obj8 = field.get(obj);
                                                        tn.p.i(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj8);
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        Object obj9 = field.get(obj);
                                                        if (obj9 != null) {
                                                            Map map = (Map) obj9;
                                                            for (Object obj10 : map.keySet()) {
                                                                Object objA = map.get(obj10);
                                                                if (objA != null) {
                                                                    if (!a(objA.getClass())) {
                                                                        objA = a(objA, objA.getClass());
                                                                    }
                                                                    jSONObject2.put(String.valueOf(obj10), objA);
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONObject2);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Object obj11 = field.get(obj);
                                                        if (obj11 != null) {
                                                            for (Object obj12 : (List) obj11) {
                                                                if (obj12 != null) {
                                                                    Object objA2 = a(obj12.getClass()) ? obj12 : a(obj12, obj12.getClass());
                                                                    if (objA2 == null) {
                                                                        obj12.getClass().toString();
                                                                    } else {
                                                                        jSONArray.put(objA2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Object obj13 = field.get(obj);
                                                        if (obj13 != null) {
                                                            int length = Array.getLength(obj13);
                                                            for (int i10 = 0; i10 < length; i10++) {
                                                                Object obj14 = Array.get(obj13, i10);
                                                                if (obj14 != null) {
                                                                    Object objA3 = a(obj14.getClass()) ? obj14 : a(obj14, obj14.getClass());
                                                                    if (objA3 == null) {
                                                                        obj14.getClass().toString();
                                                                    } else {
                                                                        jSONArray2.put(objA3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray2);
                                                    } else {
                                                        Object obj15 = field.get(obj);
                                                        if (obj15 != null) {
                                                            jSONObject.put(name, a(obj15, obj15.getClass()));
                                                        } else {
                                                            bn.r rVar = bn.r.f5635a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b10 = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b10);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (tn.p.f(cls2, cls) || tn.p.f(cls2, cls) || tn.p.f(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (tn.p.f(cls3, cls) || tn.p.f(cls3, cls) || tn.p.f(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (tn.p.f(cls4, cls) || tn.p.f(cls4, cls) || tn.p.f(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (tn.p.f(cls5, cls) || tn.p.f(cls5, cls) || tn.p.f(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (tn.p.f(cls6, cls) || tn.p.f(cls6, cls) || tn.p.f(Long.class, cls) || tn.p.f(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (tn.p.f(cls7, cls) || tn.p.f(cls7, cls) || tn.p.f(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return tn.p.f(cls8, cls) || tn.p.f(cls8, cls) || tn.p.f(Short.class, cls);
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        double d10 = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d10);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f10 = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f10);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i10);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        long j10 = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j10);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s10 = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s10);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }
}
