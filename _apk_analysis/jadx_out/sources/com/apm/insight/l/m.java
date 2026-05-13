package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.l.e;
import com.apm.insight.nativecrash.NativeImpl;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Stack.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f7402a = new StackTraceElement("", "", "", 0);

    /* JADX INFO: compiled from: Stack.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7404b;

        public a(int i10, int i11) {
            this.f7403a = i10;
            this.f7404b = i11;
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f7403a);
                jSONObject.put("end", this.f7404b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public static String a(String str) {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i11 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (i11 <= 256) {
                        linkedList.add(line);
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        linkedList2.add(line);
                        if (linkedList2.size() > 256) {
                            linkedList2.poll();
                            i10++;
                        }
                    }
                    i11++;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                }
            }
            com.apm.insight.a.a((Closeable) bufferedReader2);
        } catch (Throwable unused2) {
        }
        if (!linkedList2.isEmpty()) {
            if (i10 != 0) {
                sb2.append("\t... skip ");
                sb2.append(i10);
                sb2.append(" lines\n");
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    @NonNull
    public static String a(@NonNull Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            a(th2, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    @NonNull
    public static String a(@NonNull Throwable th2, PrintStream printStream, e.a aVar) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            a(th2, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest == null) {
            return null;
        }
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest == null || bArrDigest.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArrDigest.length << 1];
        int i10 = 0;
        for (byte b10 : bArrDigest) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb2);
        }
        return sb2.toString();
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb2) {
        String className = stackTraceElement.getClassName();
        sb2.append("  at ");
        sb2.append(className);
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        sb2.append("(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")\n");
        return sb2;
    }

    public static JSONArray a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            if (aVar.f7403a == -1) {
                if (a(stackTraceElementArr[i10].getClassName(), strArr)) {
                    aVar.f7403a = i10;
                    aVar.f7404b = i10;
                }
            } else if (!a(stackTraceElementArr[i10].getClassName(), strArr)) {
                aVar.f7404b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f7403a != -1) {
            aVar.f7404b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (aVar.f7403a == -1) {
                if (a(strArr[i10], strArr2)) {
                    aVar.f7403a = i10;
                    aVar.f7404b = i10;
                }
            } else if (!a(strArr[i10], strArr2)) {
                aVar.f7404b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f7403a != -1) {
            aVar.f7404b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    private static void a(StackTraceElement stackTraceElement, int i10) {
        try {
            NativeImpl.a(i10, "\tat ");
            NativeImpl.a(i10, stackTraceElement.getClassName());
            NativeImpl.a(i10, ".");
            NativeImpl.a(i10, stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                NativeImpl.a(i10, "(Native Method)");
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    NativeImpl.a(i10, "(");
                    NativeImpl.a(i10, stackTraceElement.getFileName());
                    NativeImpl.a(i10, StringUtils.PROCESS_POSTFIX_DELIMITER);
                    NativeImpl.a(i10, String.valueOf(stackTraceElement.getLineNumber()));
                    NativeImpl.a(i10, ")");
                } else {
                    NativeImpl.a(i10, "(");
                    NativeImpl.a(i10, stackTraceElement.getFileName());
                    NativeImpl.a(i10, ")");
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                NativeImpl.a(i10, "(Unknown Source:");
                NativeImpl.a(i10, String.valueOf(stackTraceElement.getLineNumber()));
                NativeImpl.a(i10, ")");
            } else {
                NativeImpl.a(i10, "(Unknown Source)");
            }
            NativeImpl.a(i10, "\n");
        } catch (Throwable unused) {
        }
    }

    public static void a(@NonNull Throwable th2, int i10) {
        if (th2 == null || i10 <= 0) {
            return;
        }
        try {
            b(th2, i10);
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                a(stackTraceElement, i10);
            }
            for (Throwable th3 : th2.getSuppressed()) {
                a(th3, i10, "Suppressed: ", "\t");
            }
            Throwable cause = th2.getCause();
            if (cause != null) {
                a(cause, i10, "Caused by: ", "");
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th2, int i10, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            try {
                NativeImpl.a(i10, str2);
                NativeImpl.a(i10, str);
            } catch (Throwable unused) {
            }
            b(th2, i10);
            for (StackTraceElement stackTraceElement : stackTrace) {
                a(stackTraceElement, i10);
            }
            for (Throwable th3 : th2.getSuppressed()) {
                a(th3, i10, "Suppressed: ", str2 + "\t");
            }
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            } else {
                str = "Caused by: ";
            }
        }
    }

    private static void a(Throwable th2, PrintWriter printWriter) {
        if (th2 == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        printWriter.println(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                StringBuilder sb2 = new StringBuilder("\t... skip ");
                sb2.append((stackTrace.length - i11) - 128);
                sb2.append(" lines");
                printWriter.println(sb2.toString());
                break;
            }
            printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
            i11++;
            i10++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, printWriter, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, printWriter, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, PrintWriter printWriter, String str, String str2, Set<Throwable> set, int i10) {
        while (!set.contains(th2)) {
            set.add(th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            boolean z10 = stackTrace.length > i10;
            printWriter.println(str2 + str + th2);
            int length = stackTrace.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                if (z10 && i12 > i10) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i12) - (i10 / 2)) + " lines");
                    break;
                }
                printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                i12++;
                i11++;
            }
            if (z10) {
                for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            for (Throwable th3 : th2.getSuppressed()) {
                int i13 = i10 / 2;
                a(th3, printWriter, "Suppressed: ", str2 + "\t", set, i13 > 10 ? i13 : 10);
            }
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            }
            i10 /= 2;
            if (i10 <= 10) {
                i10 = 10;
            }
            str = "Caused by: ";
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th2 + C3978d4.j.f31385e);
    }

    private static void a(Throwable th2, List<StackTraceElement> list) {
        if (th2 == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        list.add(f7402a);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                list.add(f7402a);
                break;
            } else {
                list.add(stackTraceElement);
                i11++;
                i10++;
            }
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, list, "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, list, "", setNewSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, List<StackTraceElement> list, String str, Set<Throwable> set, int i10) {
        while (!set.contains(th2)) {
            set.add(th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int i11 = 0;
            boolean z10 = stackTrace.length > i10;
            list.add(f7402a);
            int length = stackTrace.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i12];
                if (z10 && i13 > i10) {
                    list.add(f7402a);
                    break;
                } else {
                    list.add(stackTraceElement);
                    i13++;
                    i12++;
                }
            }
            if (z10) {
                for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            Throwable[] suppressed = th2.getSuppressed();
            int length3 = suppressed.length;
            while (true) {
                int i14 = 10;
                if (i11 >= length3) {
                    break;
                }
                Throwable th3 = suppressed[i11];
                String str2 = str + "\t";
                int i15 = i10 / 2;
                if (i15 > 10) {
                    i14 = i15;
                }
                a(th3, list, str2, set, i14);
                i11++;
            }
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            }
            i10 /= 2;
            if (i10 <= 10) {
                i10 = 10;
            }
        }
        list.add(f7402a);
    }

    private static boolean a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002a A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject b(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.m.b(java.lang.String):org.json.JSONObject");
    }

    private static void b(Throwable th2, int i10) {
        th2.getClass();
        String localizedMessage = th2.getLocalizedMessage();
        try {
            NativeImpl.a(i10, th2.getClass().getName());
            if (localizedMessage != null) {
                NativeImpl.a(i10, ": ");
                NativeImpl.a(i10, localizedMessage);
            }
            NativeImpl.a(i10, "\n");
        } catch (Throwable unused) {
        }
    }

    public static StackTraceElement[] b(@NonNull Throwable th2) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th2, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    private static boolean c(String str) {
        Set<String> setA = g.a();
        if (setA.contains(str)) {
            return true;
        }
        for (String str2 : setA) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            if (th2 instanceof OutOfMemoryError) {
                return true;
            }
            if (i10 > 20) {
                return false;
            }
            i10++;
            try {
                th2 = th2.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean d(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if ((th2 instanceof OutOfMemoryError) && (th2.getMessage().contains("allocate") || th2.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }
}
