package com.safedk.android.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f53067a = Arrays.asList(k.f53183d, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", ImpressionLog.f51753w, "long");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53068b = "DebugUtils";

    private static String a(long j10) {
        if (j10 <= 0) {
            return "0 Bytes";
        }
        String[] strArr = {"Bt", "kB", "MB", "GB", "TB"};
        int iLog10 = (int) (Math.log10(j10) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(j10 / Math.pow(1024.0d, iLog10)) + Z7.f30794r + strArr[iLog10];
    }

    public static List<String> a(String str) {
        File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<String> f53069a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                String path = file.getPath();
                return this.f53069a.contains(path.substring(path.lastIndexOf(".") + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    private static void a(Context context) {
        Logger.d(f53068b, "listFilesInFilesDir started, dir : " + context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + "/" + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(f53068b, "listFiles directory does not exist : " + file);
        }
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2 + " getViewDetails started, View type is " + view.getClass().getName() + ", Id=" + Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + ", View type is " + view.getClass().getName());
                }
            }
        } catch (Throwable th2) {
            Logger.e(str, str2 + " Exception in getViewDetails", th2);
        }
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(f53068b, "listFilesInDir file " + a(file.length()) + Z7.f30794r + file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(f53068b, "listFilesInDir dir  " + file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static void a(File file, File file2) throws IOException {
        FileChannel channel;
        FileChannel channel2;
        try {
            channel = new FileInputStream(file).getChannel();
        } catch (FileNotFoundException e10) {
            e = e10;
            channel = null;
        }
        try {
            channel2 = new FileOutputStream(file2).getChannel();
        } catch (FileNotFoundException e11) {
            e = e11;
            Logger.d(f53068b, "Exception copying file :" + e.getMessage(), e);
            channel2 = null;
        }
        try {
            try {
                channel.transferTo(0L, channel.size(), channel2);
                if (channel != null) {
                    channel.close();
                }
                if (channel2 != null) {
                    channel2.close();
                }
            } catch (Throwable th2) {
                Logger.d(f53068b, "Exception copying file :" + th2.getMessage(), th2);
                if (channel != null) {
                    channel.close();
                }
                if (channel2 != null) {
                    channel2.close();
                }
            }
        } catch (Throwable th3) {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
            throw th3;
        }
    }

    public static void a(String str, String str2) {
        String str3 = (Environment.getExternalStorageDirectory() + File.separator + (str2 != null ? str2 + File.separator : "")) + str.split("/")[r1.length - 1];
        Logger.d(f53068b, "copyFileToExternalStorage target = " + str3);
        Logger.d(f53068b, "copyFileToExternalStorage result = " + b(str, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0185 A[PHI: r3
      0x0185: PHI (r3v29 java.lang.String) = (r3v28 java.lang.String), (r3v34 java.lang.String) binds: [B:9:0x0112, B:11:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r11, java.lang.String r12, android.view.ViewGroup r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.b.a(java.lang.String, java.lang.String, android.view.ViewGroup, java.lang.String):void");
    }

    private static void a(String str, String str2, Object obj, int i10, int i11) {
        if (obj != null) {
            try {
                if (obj.getClass() == null) {
                    return;
                }
                if (i10 > i11) {
                    Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i11 + " current level is " + i10);
                    return;
                }
                for (Field field : obj.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    String string = c(field.getType().getName()) ? obj2 != null ? obj2.toString() : "null" : null;
                    String strReplace = new String(new char[i10 * 2]).replace("\u0000", "-");
                    if (f53067a.contains(field.getType().getName())) {
                        Logger.d(str, str2 + " reflectRecursively level " + i10 + strReplace + ", name : " + field.getName() + ", type : " + field.getType().getName() + ", value : " + string);
                    } else {
                        Logger.d(str, str2 + " reflectRecursively level " + i10 + strReplace + ", name : " + field.getName() + ", type : " + field.getType().getName());
                    }
                    if (!field.getType().isPrimitive() && obj2 != null) {
                        a(str, str2, obj2, i10 + 1, i11);
                    }
                }
            } catch (Throwable th2) {
                Logger.e(str, str2 + " reflectRecursively Exception, stopping", th2);
            }
        }
    }

    public static String b(String str) {
        SafeDK.getInstance().l();
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (FileNotFoundException e10) {
            Logger.e(f53068b, "Exception reading file " + str, e10);
        } catch (IOException e11) {
            Logger.e(f53068b, "Exception reading file " + str, e11);
        }
        return sb2.toString();
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static boolean b(String str, String str2) {
        int i10;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i10 = 0;
                while (true) {
                    int i11 = fileInputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                    fileOutputStream.write(bArr, 0, i11);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                i10 = 0;
            }
            if (new File(str2).exists()) {
                Logger.d(f53068b, "copyFile finished creating file " + str2 + ", " + i10 + " bytes written");
            } else {
                Logger.d(f53068b, "copyFile failed to create file " + str2);
            }
            return true;
        } catch (Throwable th2) {
            Logger.d(f53068b, "Exception in copyFile : " + th2.getMessage(), th2);
            return false;
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = f53067a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
