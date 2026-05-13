package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53153a = "SerializingUtils";

    public static Object a(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            Logger.e(f53153a, "failed while closing serialization stream", e10);
                        }
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Logger.e(f53153a, "failed while closing serialization stream", e11);
                            throw th;
                        }
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            objectInputStream = null;
        }
    }

    public static String a(Object obj) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream2;
        String strEncodeToString = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e10) {
                e = e10;
                objectOutputStream2 = null;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                byteArrayOutputStream = null;
            }
            try {
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    synchronized (obj) {
                        objectOutputStream2.writeObject(obj);
                    }
                    objectOutputStream2.flush();
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e11) {
                            Logger.e(f53153a, "failed during closing serialization streams with object: " + obj, e11);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException e12) {
                    e = e12;
                    Logger.e(f53153a, "failed during serialization object: " + obj + " : " + e.getMessage(), e);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e13) {
                            Logger.e(f53153a, "failed during closing serialization streams with object: " + obj, e13);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
            } catch (IOException e14) {
                e = e14;
                objectOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                objectOutputStream = null;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e15) {
                        Logger.e(f53153a, "failed during closing serialization streams with object: " + obj, e15);
                        throw th;
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            Logger.e(f53153a, "failed during serializing object : " + th5.getMessage() + " for object : " + obj, th5);
            new CrashReporter().caughtException(th5);
        }
        return strEncodeToString;
    }
}
