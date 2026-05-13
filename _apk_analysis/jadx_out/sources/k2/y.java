package k2;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GraphRequestBatch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0019 B\u0017\b\u0016\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020=¢\u0006\u0004\b>\u0010?B\u001d\b\u0016\u0012\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020@\"\u00020\u0002¢\u0006\u0004\b>\u0010AJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u0017\u001a\u00020\u0006R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R0\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R0\u00100\u001a\b\u0012\u0004\u0012\u00020\b0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010-R$\u00105\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'\"\u0004\b3\u00104R$\u0010:\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00107¨\u0006B"}, d2 = {"Lk2/y;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "", "Lk2/z;", "i", "Lk2/x;", "l", "Lk2/y$a;", "callback", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "element", "", "e", "", "index", "a", "clear", InneractiveMediationDefs.GENDER_MALE, VastAttributes.VERTICAL_POSITION, "z", "h", "j", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "o", "()Landroid/os/Handler;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Landroid/os/Handler;)V", "callbackHandler", "c", "I", "timeoutInMilliseconds", "", "d", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "id", "", "<set-?>", "Ljava/util/List;", "r", "()Ljava/util/List;", "requests", "p", "callbacks", "g", "n", "setBatchApplicationId", "(Ljava/lang/String;)V", "batchApplicationId", "t", "()I", "setTimeout", "(I)V", "timeout", "s", "size", "", "<init>", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class y extends AbstractList<GraphRequest> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f72818i = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Handler callbackHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int timeoutInMilliseconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<GraphRequest> requests;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<a> callbacks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String batchApplicationId;

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lk2/y$a;", "", "Lk2/y;", "batch", "Lbn/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(@NotNull y yVar);
    }

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lk2/y$c;", "Lk2/y$a;", "Lk2/y;", "batch", "", VideoLookHistoryEntry.CURRNET, "max", "Lbn/r;", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface c extends a {
        void b(@NotNull y yVar, long j10, long j11);
    }

    public y(@NotNull Collection<GraphRequest> collection) {
        tn.p.k(collection, "requests");
        this.id = String.valueOf(Integer.valueOf(f72818i.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(collection);
    }

    public y(@NotNull GraphRequest... graphRequestArr) {
        tn.p.k(graphRequestArr, "requests");
        this.id = String.valueOf(Integer.valueOf(f72818i.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(cn.p.f(graphRequestArr));
    }

    public final void A(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, @NotNull GraphRequest graphRequest) {
        tn.p.k(graphRequest, "element");
        this.requests.add(i10, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return g((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull GraphRequest element) {
        tn.p.k(element, "element");
        return this.requests.add(element);
    }

    public final void f(@NotNull a aVar) {
        tn.p.k(aVar, "callback");
        if (this.callbacks.contains(aVar)) {
            return;
        }
        this.callbacks.add(aVar);
    }

    public /* bridge */ boolean g(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    @NotNull
    public final List<z> h() {
        return i();
    }

    public final List<z> i() {
        return GraphRequest.INSTANCE.j(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return u((GraphRequest) obj);
        }
        return -1;
    }

    @NotNull
    public final x j() {
        return l();
    }

    public final x l() {
        return GraphRequest.INSTANCE.m(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return v((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int index) {
        return this.requests.get(index);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    @NotNull
    public final List<a> p() {
        return this.callbacks;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<GraphRequest> r() {
        return this.requests;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return x((GraphRequest) obj);
        }
        return false;
    }

    public int s() {
        return this.requests.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return s();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public /* bridge */ int u(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public /* bridge */ int v(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i10) {
        return y(i10);
    }

    public /* bridge */ boolean x(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    @NotNull
    public GraphRequest y(int index) {
        return this.requests.remove(index);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int index, @NotNull GraphRequest element) {
        tn.p.k(element, "element");
        return this.requests.set(index, element);
    }
}
