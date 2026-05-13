package ld;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StreamUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    public static <D> List<D> a(InputStream inputStream, Class<D> cls) throws Throwable {
        ObjectInputStream objectInputStream;
        System.out.println("...... className : " + cls.getSimpleName() + " ......");
        ArrayList arrayList = new ArrayList();
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            for (Object obj : (ArrayList) objectInputStream.readObject()) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            try {
                objectInputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return arrayList;
        } catch (Exception e12) {
            e = e12;
            objectInputStream2 = objectInputStream;
            e.printStackTrace();
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean b(OutputStream outputStream, Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(outputStream);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return true;
        } catch (Exception e12) {
            e = e12;
            objectOutputStream2 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream2 == null) {
                return false;
            }
            try {
                objectOutputStream2.close();
                return false;
            } catch (IOException e13) {
                e13.printStackTrace();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }
}
