package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.ironsource.C3978d4;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class MultiDexExtractor {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    private static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    private static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private static Method sApplyMethod;

    static {
        try {
            sApplyMethod = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e10) {
            sApplyMethod = null;
        }
    }

    MultiDexExtractor() {
    }

    private static void apply(SharedPreferences.Editor editor) {
        if (sApplyMethod != null) {
            try {
                sApplyMethod.invoke(editor, new Object[0]);
                return;
            } catch (IllegalAccessException e10) {
            } catch (InvocationTargetException e11) {
            }
        }
        editor.commit();
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws Throwable {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                try {
                    ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                    zipEntry2.setTime(zipEntry.getTime());
                    zipOutputStream.putNextEntry(zipEntry2);
                    byte[] bArr = new byte[16384];
                    for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                        zipOutputStream.write(bArr, 0, i10);
                    }
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    Log.i("MultiDex", "Renaming to " + file.getPath());
                    if (!fileCreateTempFile.renameTo(file)) {
                        throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                    }
                    closeQuietly(inputStream);
                    fileCreateTempFile.delete();
                } catch (Throwable th2) {
                    zipOutputStream.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(inputStream);
                fileCreateTempFile.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long getTimeStamp(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private static boolean isModified(Context context, File file, long j10) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        return (multiDexPreferences.getLong("timestamp", -1L) == getTimeStamp(file) && multiDexPreferences.getLong(KEY_CRC, -1L) == j10) ? false : true;
    }

    static List<File> load(Context context, ApplicationInfo applicationInfo, File file, boolean z10) throws IOException {
        List<File> listPerformExtractions;
        Log.i("MultiDex", "MultiDexExtractor.load(" + applicationInfo.sourceDir + ", " + z10 + ")");
        File file2 = new File(applicationInfo.sourceDir);
        long zipCrc = getZipCrc(file2);
        if (z10 || isModified(context, file2, zipCrc)) {
            Log.i("MultiDex", "Detected that extraction must be performed.");
            listPerformExtractions = performExtractions(file2, file);
            putStoredApkInfo(context, getTimeStamp(file2), zipCrc, listPerformExtractions.size() + 1);
        } else {
            try {
                listPerformExtractions = loadExistingExtractions(context, file2, file);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listPerformExtractions = performExtractions(file2, file);
                putStoredApkInfo(context, getTimeStamp(file2), zipCrc, listPerformExtractions.size() + 1);
            }
        }
        Log.i("MultiDex", "load found " + listPerformExtractions.size() + " secondary dex files");
        return listPerformExtractions;
    }

    private static List<File> loadExistingExtractions(Context context, File file, File file2) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = file.getName() + EXTRACTED_NAME_EXT;
        int i10 = getMultiDexPreferences(context).getInt(KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 2; i11 <= i10; i11++) {
            File file3 = new File(file2, str + i11 + ".zip");
            if (!file3.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
            }
            arrayList.add(file3);
            if (!verifyZipFile(file3)) {
                Log.i("MultiDex", "Invalid zip file: " + file3);
                throw new IOException("Invalid ZIP file.");
            }
        }
        return arrayList;
    }

    private static void mkdirChecked(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create cache directory " + file.getPath());
    }

    private static List<File> performExtractions(File file, File file2) throws IOException {
        String str = file.getName() + EXTRACTED_NAME_EXT;
        prepareDexDir(file2, str);
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        int i10 = 2;
        try {
            ZipEntry entry = zipFile.getEntry(DEX_PREFIX + "2.dex");
            while (entry != null) {
                File file3 = new File(file2, str + i10 + ".zip");
                arrayList.add(file3);
                Log.i("MultiDex", "Extraction is needed for file " + file3);
                int i11 = 0;
                boolean zVerifyZipFile = false;
                while (i11 < 3 && !zVerifyZipFile) {
                    i11++;
                    extract(zipFile, entry, file3, str);
                    zVerifyZipFile = verifyZipFile(file3);
                    Log.i("MultiDex", "Extraction " + (zVerifyZipFile ? "success" : C3978d4.i.f31363t) + " - length " + file3.getAbsolutePath() + ": " + file3.length());
                    if (!zVerifyZipFile) {
                        file3.delete();
                        if (file3.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + file3.getPath() + "'");
                        }
                    }
                }
                if (!zVerifyZipFile) {
                    throw new IOException("Could not create zip file " + file3.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry(DEX_PREFIX + i10 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to close resource", e10);
            }
        }
    }

    private static void prepareDexDir(File file, final String str) throws IOException {
        mkdirChecked(file.getParentFile());
        mkdirChecked(file);
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: android.support.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return !file2.getName().startsWith(str);
            }
        });
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
            return;
        }
        for (File file2 : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
            if (file2.delete()) {
                Log.i("MultiDex", "Deleted old file " + file2.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
            }
        }
    }

    private static void putStoredApkInfo(Context context, long j10, long j11, int i10) {
        SharedPreferences.Editor editorEdit = getMultiDexPreferences(context).edit();
        editorEdit.putLong("timestamp", j10);
        editorEdit.putLong(KEY_CRC, j11);
        editorEdit.putInt(KEY_DEX_NUMBER, i10);
        apply(editorEdit);
    }

    static boolean verifyZipFile(File file) {
        try {
            try {
                try {
                    new ZipFile(file).close();
                    return true;
                } catch (IOException e10) {
                    Log.w("MultiDex", "Failed to close zip file: " + file.getAbsolutePath());
                    return false;
                }
            } catch (ZipException e11) {
                Log.w("MultiDex", "File " + file.getAbsolutePath() + " is not a valid zip file.", e11);
            }
        } catch (IOException e12) {
            Log.w("MultiDex", "Got an IOException trying to open zip file: " + file.getAbsolutePath(), e12);
        }
    }
}
