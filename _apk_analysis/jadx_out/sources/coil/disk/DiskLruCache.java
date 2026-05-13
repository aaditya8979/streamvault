package coil.disk;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import bo.a0;
import bo.d0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import okio.BufferedSink;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.j2;
import p000do.l0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001P\b\u0000\u0018\u0000 Y2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004Z$(+B7\u0012\u0006\u0010S\u001a\u00020T\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020*¢\u0006\u0004\bW\u0010XJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u001c\u0010\u0011\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\rR\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0014\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\u0013R\u00020\u0000H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0006\u0010\u001d\u001a\u00020\u0004J\u0017\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u00002\u0006\u0010\u001b\u001a\u00020\bH\u0086\u0002J\u0014\u0010 \u001a\b\u0018\u00010\rR\u00020\u00002\u0006\u0010\u001b\u001a\u00020\bJ\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0007R\u0014\u00100\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00102\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00104\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010%R8\u00109\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0013R\u00020\u000005j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0013R\u00020\u0000`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u000bR\u0016\u0010A\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0007R\u0018\u0010D\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006["}, d2 = {"Lcoil/disk/DiskLruCache;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Lbn/r;", "K", "Lokio/BufferedSink;", "I", "", "line", "L", "J", "Q", "Lcoil/disk/DiskLruCache$b;", "editor", "", "success", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Lcoil/disk/DiskLruCache$c;", "entry", "M", VastAttributes.HORIZONTAL_POSITION, "O", "N", "delete", "H", "key", "P", "F", "Lcoil/disk/DiskLruCache$d;", "C", "B", "close", "flush", "Lokio/Path;", "b", "Lokio/Path;", "directory", "", "c", "maxSize", "", "d", "appVersion", "e", "valueCount", InneractiveMediationDefs.GENDER_FEMALE, "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "lruEntries", "Ldo/l0;", "j", "Ldo/l0;", "cleanupScope", CampaignEx.JSON_KEY_AD_K, "size", "l", "operationsSinceRewrite", InneractiveMediationDefs.GENDER_MALE, "Lokio/BufferedSink;", "journalWriter", "n", "Z", "hasJournalErrors", "o", "initialized", "p", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "coil/disk/DiskLruCache$e", "s", "Lcoil/disk/DiskLruCache$e;", "fileSystem", "Lokio/FileSystem;", "Ldo/h0;", "cleanupDispatcher", "<init>", "(Lokio/FileSystem;Lokio/Path;Ldo/h0;JII)V", "t", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Regex f6875u = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long maxSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int appVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int valueCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path journalFile;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path journalFileTmp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path journalFileBackup;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, c> lruEntries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 cleanupScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int operationsSinceRewrite;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BufferedSink journalWriter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasJournalErrors;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean initialized;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentTrimFailed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean mostRecentRebuildFailed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e fileSystem;

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0010R\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\f\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\nJ\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u001b\u0010\u0014\u001a\u00060\u0010R\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcoil/disk/DiskLruCache$b;", "", "", "index", "Lokio/Path;", InneractiveMediationDefs.GENDER_FEMALE, "Lbn/r;", "e", "b", "Lcoil/disk/DiskLruCache$d;", "Lcoil/disk/DiskLruCache;", "c", "a", "", "success", "d", "Lcoil/disk/DiskLruCache$c;", "Lcoil/disk/DiskLruCache$c;", "g", "()Lcoil/disk/DiskLruCache$c;", "entry", "Z", "closed", "", "[Z", "h", "()[Z", "written", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$c;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final boolean[] written;

        public b(@NotNull c cVar) {
            this.entry = cVar;
            this.written = new boolean[DiskLruCache.this.valueCount];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        @Nullable
        public final d c() {
            d dVarC;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                b();
                dVarC = diskLruCache.C(this.entry.getKey());
            }
            return dVarC;
        }

        public final void d(boolean z10) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (p.f(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.A(this, z10);
                }
                this.closed = true;
                r rVar = r.f5635a;
            }
        }

        public final void e() {
            if (p.f(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        @NotNull
        public final Path f(int index) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.written[index] = true;
                Path path2 = this.entry.c().get(index);
                o0.e.a(diskLruCache.fileSystem, path2);
                path = path2;
            }
            return path;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b7\u00108J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\f\u001a\b\u0018\u00010\nR\u00020\u000bR\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\r\u0010\u001dR'\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R(\u00100\u001a\b\u0018\u00010+R\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010,\u001a\u0004\b\u0013\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b'\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcoil/disk/DiskLruCache$c;", "", "", "", "strings", "Lbn/r;", "j", "Lokio/BufferedSink;", "writer", "o", "Lcoil/disk/DiskLruCache$d;", "Lcoil/disk/DiskLruCache;", "n", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "key", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lokio/Path;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", InneractiveMediationDefs.GENDER_FEMALE, "h", InneractiveMediationDefs.GENDER_MALE, "zombie", "Lcoil/disk/DiskLruCache$b;", "Lcoil/disk/DiskLruCache$b;", "()Lcoil/disk/DiskLruCache$b;", "i", "(Lcoil/disk/DiskLruCache$b;)V", "currentEditor", "", "I", "()I", CampaignEx.JSON_KEY_AD_K, "(I)V", "lockingSnapshotCount", "<init>", "(Lcoil/disk/DiskLruCache;Ljava/lang/String;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<Path> cleanFiles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ArrayList<Path> dirtyFiles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean readable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean zombie;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b currentEditor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int lockingSnapshotCount;

        public c(@NotNull String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            this.dirtyFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = DiskLruCache.this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.cleanFiles.add(DiskLruCache.this.directory.resolve(sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(DiskLruCache.this.directory.resolve(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<Path> a() {
            return this.cleanFiles;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final ArrayList<Path> c() {
            return this.dirtyFiles;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(@Nullable b bVar) {
            this.currentEditor = bVar;
        }

        public final void j(@NotNull List<String> list) throws IOException {
            if (list.size() != DiskLruCache.this.valueCount) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.lockingSnapshotCount = i10;
        }

        public final void l(boolean z10) {
            this.readable = z10;
        }

        public final void m(boolean z10) {
            this.zombie = z10;
        }

        @Nullable
        public final d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<Path> arrayList = this.cleanFiles;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!diskLruCache.fileSystem.exists(arrayList.get(i10))) {
                    try {
                        diskLruCache.M(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return DiskLruCache.this.new d(this);
        }

        public final void o(@NotNull BufferedSink bufferedSink) throws IOException {
            for (long j10 : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0011\u001a\u00060\fR\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\f\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\nR\u001b\u0010\u0011\u001a\u00060\fR\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcoil/disk/DiskLruCache$d;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "index", "Lokio/Path;", "e", "Lbn/r;", "close", "Lcoil/disk/DiskLruCache$b;", "Lcoil/disk/DiskLruCache;", "d", "Lcoil/disk/DiskLruCache$c;", "b", "Lcoil/disk/DiskLruCache$c;", "getEntry", "()Lcoil/disk/DiskLruCache$c;", "entry", "", "c", "Z", "closed", "<init>", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$c;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public final class d implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c entry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public d(@NotNull c cVar) {
            this.entry = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                this.entry.k(r1.getLockingSnapshotCount() - 1);
                if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                    diskLruCache.M(this.entry);
                }
                r rVar = r.f5635a;
            }
        }

        @Nullable
        public final b d() {
            b bVarB;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                bVarB = diskLruCache.B(this.entry.getKey());
            }
            return bVarB;
        }

        @NotNull
        public final Path e(int index) {
            if (!this.closed) {
                return this.entry.a().get(index);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"coil/disk/DiskLruCache$e", "Lokio/ForwardingFileSystem;", "Lokio/Path;", C3978d4.i.f31327b, "", "mustCreate", "Lokio/Sink;", "sink", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends ForwardingFileSystem {
        public e(FileSystem fileSystem) {
            super(fileSystem);
        }

        @Override // okio.ForwardingFileSystem, okio.FileSystem
        @NotNull
        public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
            Path pathParent = file.parent();
            if (pathParent != null) {
                createDirectories(pathParent);
            }
            return super.sink(file, mustCreate);
        }
    }

    public DiskLruCache(@NotNull FileSystem fileSystem, @NotNull Path path, @NotNull h0 h0Var, long j10, int i10, int i11) {
        this.directory = path;
        this.maxSize = j10;
        this.appVersion = i10;
        this.valueCount = i11;
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = path.resolve(com.bumptech.glide.disklrucache.DiskLruCache.JOURNAL_FILE);
        this.journalFileTmp = path.resolve(com.bumptech.glide.disklrucache.DiskLruCache.JOURNAL_FILE_TEMP);
        this.journalFileBackup = path.resolve(com.bumptech.glide.disklrucache.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupScope = kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(h0Var.limitedParallelism(1)));
        this.fileSystem = new e(fileSystem);
    }

    private final void delete() throws IOException {
        close();
        o0.e.b(this.fileSystem, this.directory);
    }

    public final synchronized void A(b bVar, boolean z10) {
        c entry = bVar.getEntry();
        if (!p.f(entry.getCurrentEditor(), bVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (!z10 || entry.getZombie()) {
            int i11 = this.valueCount;
            while (i10 < i11) {
                this.fileSystem.delete(entry.c().get(i10));
                i10++;
            }
        } else {
            int i12 = this.valueCount;
            for (int i13 = 0; i13 < i12; i13++) {
                if (bVar.getWritten()[i13] && !this.fileSystem.exists(entry.c().get(i13))) {
                    bVar.a();
                    return;
                }
            }
            int i14 = this.valueCount;
            while (i10 < i14) {
                Path path = entry.c().get(i10);
                Path path2 = entry.a().get(i10);
                if (this.fileSystem.exists(path)) {
                    this.fileSystem.atomicMove(path, path2);
                } else {
                    o0.e.a(this.fileSystem, entry.a().get(i10));
                }
                long j10 = entry.getLengths()[i10];
                Long size = this.fileSystem.metadata(path2).getSize();
                long jLongValue = size != null ? size.longValue() : 0L;
                entry.getLengths()[i10] = jLongValue;
                this.size = (this.size - j10) + jLongValue;
                i10++;
            }
        }
        entry.i(null);
        if (entry.getZombie()) {
            M(entry);
            return;
        }
        this.operationsSinceRewrite++;
        BufferedSink bufferedSink = this.journalWriter;
        p.h(bufferedSink);
        if (z10 || entry.getReadable()) {
            entry.l(true);
            bufferedSink.writeUtf8("CLEAN");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            entry.o(bufferedSink);
            bufferedSink.writeByte(10);
        } else {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8("REMOVE");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.size > this.maxSize || G()) {
            H();
        }
    }

    @Nullable
    public final synchronized b B(@NotNull String key) {
        x();
        P(key);
        F();
        c cVar = this.lruEntries.get(key);
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            BufferedSink bufferedSink = this.journalWriter;
            p.h(bufferedSink);
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(key);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(key);
                this.lruEntries.put(key, cVar);
            }
            b bVar = new b(cVar);
            cVar.i(bVar);
            return bVar;
        }
        H();
        return null;
    }

    @Nullable
    public final synchronized d C(@NotNull String key) {
        d dVarN;
        x();
        P(key);
        F();
        c cVar = this.lruEntries.get(key);
        if (cVar != null && (dVarN = cVar.n()) != null) {
            this.operationsSinceRewrite++;
            BufferedSink bufferedSink = this.journalWriter;
            p.h(bufferedSink);
            bufferedSink.writeUtf8("READ");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(key);
            bufferedSink.writeByte(10);
            if (G()) {
                H();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void F() {
        if (this.initialized) {
            return;
        }
        this.fileSystem.delete(this.journalFileTmp);
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
            }
        }
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                K();
                J();
                this.initialized = true;
                return;
            } catch (IOException unused) {
                try {
                    delete();
                    this.closed = false;
                    Q();
                    this.initialized = true;
                } catch (Throwable th2) {
                    this.closed = false;
                    throw th2;
                }
            }
        }
        Q();
        this.initialized = true;
    }

    public final boolean G() {
        return this.operationsSinceRewrite >= 2000;
    }

    public final void H() {
        i.d(this.cleanupScope, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    public final BufferedSink I() {
        return Okio.buffer(new b0.b(this.fileSystem.appendingSink(this.journalFile), new l<IOException, r>() { // from class: coil.disk.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(IOException iOException) {
                invoke2(iOException);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IOException iOException) {
                this.this$0.hasJournalErrors = true;
            }
        }));
    }

    public final void J() throws IOException {
        Iterator<c> it = this.lruEntries.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    j10 += next.getLengths()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(next.a().get(i10));
                    this.fileSystem.delete(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.size = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.K():void");
    }

    public final void L(String str) throws IOException {
        String strSubstring;
        int iQ0 = d0.q0(str, ' ', 0, false, 6, null);
        if (iQ0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iQ0 + 1;
        int iQ02 = d0.q0(str, ' ', i10, false, 4, null);
        if (iQ02 == -1) {
            strSubstring = str.substring(i10);
            p.j(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iQ0 == 6 && a0.W(str, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iQ02);
            p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap<String, c> linkedHashMap = this.lruEntries;
        c cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = cVar;
        if (iQ02 != -1 && iQ0 == 5 && a0.W(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iQ02 + 1);
            p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List<String> listT0 = d0.T0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(listT0);
            return;
        }
        if (iQ02 == -1 && iQ0 == 5 && a0.W(str, "DIRTY", false, 2, null)) {
            cVar2.i(new b(cVar2));
            return;
        }
        if (iQ02 == -1 && iQ0 == 4 && a0.W(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final boolean M(c entry) throws IOException {
        BufferedSink bufferedSink;
        if (entry.getLockingSnapshotCount() > 0 && (bufferedSink = this.journalWriter) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m(true);
            return true;
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.a().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.operationsSinceRewrite++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (G()) {
            H();
        }
        return true;
    }

    public final boolean N() throws IOException {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie()) {
                M(cVar);
                return true;
            }
        }
        return false;
    }

    public final void O() {
        while (this.size > this.maxSize) {
            if (!N()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final void P(String str) {
        if (f6875u.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void Q() {
        r rVar;
        BufferedSink bufferedSink = this.journalWriter;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp, false));
        Throwable th2 = null;
        try {
            bufferedSinkBuffer.writeUtf8(com.bumptech.glide.disklrucache.DiskLruCache.MAGIC).writeByte(10);
            bufferedSinkBuffer.writeUtf8("1").writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.appVersion).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.valueCount).writeByte(10);
            bufferedSinkBuffer.writeByte(10);
            for (c cVar : this.lruEntries.values()) {
                if (cVar.getCurrentEditor() != null) {
                    bufferedSinkBuffer.writeUtf8("DIRTY");
                    bufferedSinkBuffer.writeByte(32);
                    bufferedSinkBuffer.writeUtf8(cVar.getKey());
                    bufferedSinkBuffer.writeByte(10);
                } else {
                    bufferedSinkBuffer.writeUtf8("CLEAN");
                    bufferedSinkBuffer.writeByte(32);
                    bufferedSinkBuffer.writeUtf8(cVar.getKey());
                    cVar.o(bufferedSinkBuffer);
                    bufferedSinkBuffer.writeByte(10);
                }
            }
            rVar = r.f5635a;
        } catch (Throwable th3) {
            rVar = null;
            th2 = th3;
        }
        if (bufferedSinkBuffer != null) {
            try {
                bufferedSinkBuffer.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                } else {
                    bn.d.a(th2, th4);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(rVar);
        if (this.fileSystem.exists(this.journalFile)) {
            this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
            this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
        } else {
            this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
        }
        this.journalWriter = I();
        this.operationsSinceRewrite = 0;
        this.hasJournalErrors = false;
        this.mostRecentRebuildFailed = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.initialized && !this.closed) {
            Object[] array = this.lruEntries.values().toArray(new c[0]);
            p.i(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (c cVar : (c[]) array) {
                b currentEditor = cVar.getCurrentEditor();
                if (currentEditor != null) {
                    currentEditor.e();
                }
            }
            O();
            kotlinx.coroutines.d.e(this.cleanupScope, null, 1, null);
            BufferedSink bufferedSink = this.journalWriter;
            p.h(bufferedSink);
            bufferedSink.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            x();
            O();
            BufferedSink bufferedSink = this.journalWriter;
            p.h(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final void x() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }
}
