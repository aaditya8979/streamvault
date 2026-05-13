package wf;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: UCropFileUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f86404a = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static void a(@NonNull String str, @NonNull String str2) throws Throwable {
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                channel2.close();
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static String b() {
        return f86404a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(String str) {
        return str + f86404a.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2f java.lang.IllegalArgumentException -> L31
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f java.lang.IllegalArgumentException -> L31
            if (r8 == 0) goto L29
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            if (r9 == 0) goto L29
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            r8.close()
            return r9
        L27:
            r9 = move-exception
            goto L33
        L29:
            if (r8 == 0) goto L4f
        L2b:
            r8.close()
            goto L4f
        L2f:
            r9 = move-exception
            goto L52
        L31:
            r9 = move-exception
            r8 = r7
        L33:
            java.lang.String r10 = "FileUtils"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "getDataColumn: _data - [%s]"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L50
            r2 = 0
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L50
            r1[r2] = r9     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = java.lang.String.format(r11, r0, r1)     // Catch: java.lang.Throwable -> L50
            android.util.Log.i(r10, r9)     // Catch: java.lang.Throwable -> L50
            if (r8 == 0) goto L4f
            goto L2b
        L4f:
            return r7
        L50:
            r9 = move-exception
            r7 = r8
        L52:
            if (r7 == 0) goto L57
            r7.close()
        L57:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.j.d(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String e(Uri uri) {
        return (j(uri.toString()) || p(uri.toString())) ? uri.toString() : uri.getPath();
    }

    public static String f(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    @SuppressLint({"NewApi"})
    public static String g(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (l(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else if (k(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return d(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e10) {
                        Log.i("FileUtils", e10.getMessage());
                        return null;
                    }
                }
            } else if (r(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return d(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return n(uri) ? uri.getLastPathSegment() : d(context, uri, null, null);
            }
            if (C3978d4.i.f31327b.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static String h(Context context, boolean z10, Uri uri) {
        if (z10) {
            String strF = f(context, uri);
            if (m(strF)) {
                return ".gif";
            }
            if (t(strF)) {
                return ".webp";
            }
        }
        return "";
    }

    public static String i(Context context, boolean z10, Uri uri) {
        if (z10) {
            String strF = f(context, uri);
            if (m(strF)) {
                return ".gif";
            }
            if (t(strF)) {
                return ".webp";
            }
        }
        return ".jpeg";
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean k(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean l(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean m(String str) {
        return str != null && (str.equals("image/gif") || str.equals("image/GIF"));
    }

    public static boolean n(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean o(String str) {
        return str != null && str.startsWith("audio");
    }

    public static boolean p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith("https") || str.startsWith("/http") || str.startsWith("/https");
    }

    public static boolean q(String str) {
        return str != null && str.startsWith("video");
    }

    public static boolean r(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean s(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().endsWith(".mp4");
    }

    public static boolean t(String str) {
        return str != null && (str.equals("image/webp") || str.equals("image/WEBP"));
    }

    public static Uri u(Context context, boolean z10, Uri uri, Uri uri2) {
        try {
            String strH = h(context, z10, uri);
            if (TextUtils.isEmpty(strH)) {
                return uri2;
            }
            String string = j(uri2.toString()) ? uri2.toString() : uri2.getPath();
            String strReplace = string.replace(string.substring(string.lastIndexOf(".")), strH);
            return j(strReplace) ? Uri.parse(strReplace) : Uri.fromFile(new File(strReplace));
        } catch (Exception e10) {
            e10.printStackTrace();
            return uri2;
        }
    }

    public static boolean v(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e10) {
                e = e10;
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    outputStream.flush();
                    a.c(bufferedInputStream);
                    a.c(bufferedOutputStream);
                    return true;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Exception e12) {
            e = e12;
            bufferedInputStream2 = bufferedInputStream;
            try {
                e.printStackTrace();
                a.c(bufferedInputStream2);
                a.c(bufferedOutputStream);
                return false;
            } catch (Throwable th4) {
                th = th4;
                a.c(bufferedInputStream2);
                a.c(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream2 = bufferedInputStream;
            a.c(bufferedInputStream2);
            a.c(bufferedOutputStream);
            throw th;
        }
    }
}
