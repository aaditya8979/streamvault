package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.B7;
import com.ironsource.C3978d4;
import com.ironsource.C4228r4;
import com.ironsource.C4273tf;
import com.ironsource.C8;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceFilesBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34010a = "supersonicads";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4273tf f34011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f34012c;

    private static void a(Context context) {
        C4273tf c4273tf = f34011b;
        if (c4273tf != null && c4273tf.b()) {
            deleteCacheDirectories(context);
        }
        C4273tf c4273tf2 = f34011b;
        if (c4273tf2 == null || !c4273tf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static boolean a() {
        C4273tf c4273tf;
        return Build.VERSION.SDK_INT > 29 && (c4273tf = f34011b) != null && c4273tf.a();
    }

    private static File b(Context context) {
        B7 b7I = Lb.U().i();
        C4273tf c4273tf = f34011b;
        return (c4273tf == null || !c4273tf.d()) ? b7I.f(context) : b7I.l(context);
    }

    private static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(f34010a);
        sb2.append(str);
        return new File(sb2.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObjectJsonObjectInit.put("files", c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject buildFilesMapOfDirectory(C8 c82, JSONObject jSONObject) throws Exception {
        if (c82 == null || !c82.isDirectory()) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        File[] fileArrListFiles = c82.listFiles();
        if (fileArrListFiles == null) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (File file : fileArrListFiles) {
            C8 c83 = new C8(file.getPath());
            if (c83.isFile()) {
                String name = c83.getName();
                JSONObject jSONObjectA = c83.a();
                if (jSONObject.has(name)) {
                    jSONObjectJsonObjectInit.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObjectJsonObjectInit.put(name, jSONObjectA);
                }
            } else if (c83.isDirectory()) {
                jSONObjectJsonObjectInit.put(c83.getName(), buildFilesMapOfDirectory(c83, jSONObject));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    private static File c(Context context) {
        B7 b7I = Lb.U().i();
        C4273tf c4273tf = f34011b;
        return (c4273tf == null || !c4273tf.d()) ? b7I.j(context) : b7I.B(context);
    }

    private static Object c(File file) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObjectJsonObjectInit.put("files", jSONArray);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static void deleteCacheDirectories(Context context) {
        B7 b7I = Lb.U().i();
        a(b7I.l(context));
        a(b7I.B(context));
    }

    public static synchronized boolean deleteFile(C8 c82) {
        if (!c82.exists()) {
            return false;
        }
        return c82.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        B7 b7I = Lb.U().i();
        a(b7I.f(context));
        a(b7I.j(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean deleteFolder(java.lang.String r2) {
        /*
            java.lang.Class<com.ironsource.sdk.utils.IronSourceStorageUtils> r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = deleteFolderContentRecursive(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            boolean r2 = r1.delete()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolder(java.lang.String):boolean");
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C4273tf c4273tf = f34011b;
        if (c4273tf == null || !c4273tf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(C3978d4.c.f31253u + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        f34012c = true;
        return fileB.getPath();
    }

    public static ArrayList<C8> getFilesInFolderRecursive(C8 c82) {
        if (c82 == null || !c82.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c82.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C8 c83 = new C8(file.getPath());
                if (c83.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c83));
                }
                if (c83.isFile()) {
                    arrayList.add(c83);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(C8 c82) {
        long totalSizeOfDir;
        long j10 = 0;
        if (c82 != null && c82.isDirectory()) {
            File[] fileArrListFiles = c82.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C8 c83 = new C8(file.getPath());
                if (c83.isFile()) {
                    totalSizeOfDir = c83.length();
                } else if (c83.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c83);
                }
                j10 += totalSizeOfDir;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(@NotNull Context context, @NotNull C4273tf c4273tf) {
        f34011b = c4273tf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f34012c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C8 c82) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c82));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStreamFileOutputStreamCtor = IronSourceFilesBridge.fileOutputStreamCtor(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int i11 = byteArrayInputStream.read(bArr2);
                if (i11 == -1) {
                    return i10;
                }
                fileOutputStreamFileOutputStreamCtor.write(bArr2, 0, i11);
                i10 += i11;
            }
        } finally {
            fileOutputStreamFileOutputStreamCtor.close();
            byteArrayInputStream.close();
        }
    }
}
