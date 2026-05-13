package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bn.h;
import bn.r;
import cn.a0;
import cn.f0;
import cn.w;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.C4157n2;
import com.ironsource.G5;
import com.squareup.picasso.Utils;
import fn.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.q;
import tn.n;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0004ê\u0002ë\u0002B¢\u0001\u0012\u000b\u0010í\u0001\u001a\u0006\u0012\u0002\b\u00030L\u0012\b\u0010ñ\u0001\u001a\u00030Ê\u0001\u0012\b\u0010ô\u0001\u001a\u00030ó\u0001\u0012\u000f\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ö\u0001\u0012-\u0010ú\u0001\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J\u0012-\u0010ü\u0001\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J\u0012\u0007\u0010ý\u0001\u001a\u00020X¢\u0006\u0006\bè\u0002\u0010é\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J;\u0010\u0012\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112&\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011H\u0002JK\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2&\u0010\u0018\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\u001a\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J,\u0010\"\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0002J(\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0018\u00105\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u0002H\u0002J \u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002J \u0010>\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0002J\u0014\u0010@\u001a\u00020\u0006*\u00020?2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010A\u001a\u00020\u0002H\u0002J\b\u0010B\u001a\u00020\u0002H\u0002JR\u0010H\u001a\u00020\u00022\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0C2&\u0010E\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00112\b\u0010F\u001a\u0004\u0018\u00010\t2\u0006\u0010G\u001a\u00020\u001dH\u0002JR\u0010S\u001a\u00028\u0000\"\u0004\b\u0000\u0010I2,\u0010P\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0082\b¢\u0006\u0004\bS\u0010TJ,\u0010V\u001a\u00028\u0000\"\u0004\b\u0000\u0010I2\u0006\u0010U\u001a\u00020?2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0082\b¢\u0006\u0004\bV\u0010WJk\u0010`\u001a\u00028\u0000\"\u0004\b\u0000\u0010I2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010_\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020]\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010^0\\0[2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0002¢\u0006\u0004\b`\u0010aJ@\u0010e\u001a\u00020\u00022\u001a\u0010c\u001a\u0016\u0012\u0004\u0012\u00020]\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010^0b2\u0013\u0010D\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q¢\u0006\u0002\bdH\u0002¢\u0006\u0004\be\u0010fJ\u0016\u0010g\u001a\u0004\u0018\u00010\t*\u00020?2\u0006\u0010+\u001a\u00020\u0006H\u0002J\b\u0010h\u001a\u00020\u0002H\u0002J\b\u0010i\u001a\u00020\u0002H\u0002J0\u0010k\u001a\u00020\u00022&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J0\u0010l\u001a\u00020\u00022&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J0\u0010m\u001a\u00020\u00022&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J:\u0010o\u001a\u00020\u00022\b\b\u0002\u0010n\u001a\u00020\u001d2&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J\b\u0010p\u001a\u00020\u0002H\u0002J\u001f\u0010s\u001a\u00020\u00022\u000e\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0qH\u0002¢\u0006\u0004\bs\u0010tJ\b\u0010s\u001a\u00020\u0002H\u0002J\u0012\u0010v\u001a\u00020\u00022\b\u0010u\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010w\u001a\u00020\u0002H\u0002J\u0012\u0010x\u001a\u00020\u00022\b\b\u0002\u0010n\u001a\u00020\u001dH\u0002J\u0010\u0010{\u001a\u00020\u00022\u0006\u0010z\u001a\u00020yH\u0002J0\u0010|\u001a\u00020\u00022&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J0\u0010}\u001a\u00020\u00022&\u0010j\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`OH\u0002J\b\u0010~\u001a\u00020\u0002H\u0002J\b\u0010\u007f\u001a\u00020\u0002H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00022\u0007\u0010\u0080\u0001\u001a\u00020\u0006H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020\u00022\u0007\u0010\u0082\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0087\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0088\u0001\u001a\u00020\u0002H\u0002J\u001a\u0010\u008a\u0001\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J!\u0010\u008b\u0001\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0002H\u0002J&\u0010\u008e\u0001\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0090\u0001\u001a\u00020\u00022\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0002J&\u0010\u0091\u0001\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0092\u0001\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0093\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010\u0094\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0095\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0096\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010\u0097\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010\u0098\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010\u009b\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\t\u0010\u009c\u0001\u001a\u00020\u0002H\u0016J\u0012\u0010\u009e\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009a\u0001J\u0012\u0010¡\u0001\u001a\u00020\u001dH\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\t\u0010¢\u0001\u001a\u00020\u0002H\u0016J\t\u0010£\u0001\u001a\u00020\u0002H\u0016J\u001e\u0010¥\u0001\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00172\r\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016J\t\u0010¦\u0001\u001a\u00020\u0002H\u0016J\t\u0010§\u0001\u001a\u00020\u0002H\u0016J\u001b\u0010¨\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010©\u0001\u001a\u00020\u0002H\u0016J\t\u0010ª\u0001\u001a\u00020\u0002H\u0016J\t\u0010«\u0001\u001a\u00020\u0002H\u0016JC\u0010¯\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010¬\u0001\"\u0004\b\u0001\u0010\u00172\u0007\u0010\u00ad\u0001\u001a\u00028\u00002\u0019\u0010R\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020®\u0001H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010³\u0001\u001a\u00020\t2\t\u0010±\u0001\u001a\u0004\u0018\u00010\t2\t\u0010²\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u000b\u0010´\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010µ\u0001\u001a\u00020\u001d2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030¶\u0001H\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030·\u0001H\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030¸\u0001H\u0017J\u0012\u0010µ\u0001\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\u001dH\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030¹\u0001H\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030º\u0001H\u0017J\u0013\u0010µ\u0001\u001a\u00020\u001d2\b\u0010\u00ad\u0001\u001a\u00030»\u0001H\u0017J\u0012\u0010µ\u0001\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\u0006H\u0017J3\u0010½\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0007\u0010¼\u0001\u001a\u00020\u001d2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0087\bø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0014\u0010¿\u0001\u001a\u00020\u00022\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010À\u0001\u001a\u00020\u00022\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010Â\u0001\u001a\u00020\u00022\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020QH\u0016J(\u0010Å\u0001\u001a\u00020\u00022\u0014\u0010Ä\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ã\u00010qH\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\t\u0010Ç\u0001\u001a\u00020\u0002H\u0017J&\u0010È\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\n\u0010Ë\u0001\u001a\u00030Ê\u0001H\u0016J%\u0010Ï\u0001\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020]2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0012\u0010Ò\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\t\u0010Ó\u0001\u001a\u00020\u0002H\u0017J\t\u0010Ô\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010Õ\u0001\u001a\u00020\u00022\u0007\u0010µ\u0001\u001a\u00020\u001dH\u0017J\u0011\u0010Ö\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u0001H\u0017J \u0010Ù\u0001\u001a\u00020\u00022\u000b\u0010\u00ad\u0001\u001a\u0006\u0012\u0002\b\u00030C2\b\u0010F\u001a\u0004\u0018\u00010\tH\u0017J(\u0010Ü\u0001\u001a\u00020\u00022\u001d\u0010Û\u0001\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030Ú\u0001\u0012\u0007\u0012\u0005\u0018\u00010Ú\u00010\\0[H\u0017J\u0013\u0010Þ\u0001\u001a\u00020\u00022\b\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0017J\u001b\u0010ß\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0017J\t\u0010à\u0001\u001a\u00020\u0002H\u0017J@\u0010â\u0001\u001a\u00020\u00022\u001a\u0010c\u001a\u0016\u0012\u0004\u0012\u00020]\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010^0b2\u0011\u0010D\u001a\r\u0012\u0004\u0012\u00020\u00020Q¢\u0006\u0002\bdH\u0000¢\u0006\u0005\bá\u0001\u0010fJ \u0010å\u0001\u001a\u00020\u00022\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020QH\u0000¢\u0006\u0006\bã\u0001\u0010ä\u0001J.\u0010è\u0001\u001a\u00020\u001d2\u001a\u0010c\u001a\u0016\u0012\u0004\u0012\u00020]\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010^0bH\u0000¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u000b\u0010é\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010ê\u0001\u001a\u00020\u00022\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010ì\u0001\u001a\u00020\u00022\u0007\u0010\u0018\u001a\u00030ë\u0001H\u0016R#\u0010í\u0001\u001a\u0006\u0012\u0002\b\u00030L8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ñ\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010ô\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001f\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R?\u0010ú\u0001\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R?\u0010ü\u0001\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010û\u0001R\u001f\u0010ý\u0001\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R \u0010\u0082\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010#0\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001b\u0010\u0084\u0002\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0089\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0002R\u001a\u0010\u0088\u0002\u001a\u00030\u0087\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0019\u0010\u008a\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u0086\u0002R\u001a\u0010\u008b\u0002\u001a\u00030\u0087\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u0089\u0002R\u001c\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R;\u0010\u0091\u0002\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u008f\u0002j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0090\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010¡\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0093\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0093\u0002R\u0019\u0010\u0095\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0093\u0002R\u001c\u0010_\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b_\u0010û\u0001R\u0018\u0010\u0097\u0002\u001a\u00030\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0089\u0002R9\u0010\u0098\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002Ru\u0010\u009a\u0002\u001a`\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u00110\u008f\u0002j/\u0012\u0004\u0012\u00020\u0006\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00100\u000ej\u0002`\u0011`\u0090\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u0092\u0002R\u0019\u0010\u009b\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u0093\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u0089\u0002R\u0019\u0010\u009d\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u0093\u0002R\u0019\u0010\u009e\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u0086\u0002R\u0019\u0010\u009f\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u0086\u0002R\u001a\u0010¡\u0002\u001a\u00030 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0019\u0010£\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010\u0086\u0002R\u001e\u0010¤\u0002\u001a\t\u0012\u0004\u0012\u00020]0\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010\u0083\u0002R*\u0010¦\u0002\u001a\u00020\u001d2\u0007\u0010¥\u0002\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¦\u0002\u0010\u0093\u0002\u001a\u0006\b§\u0002\u0010 \u0001R*\u0010¨\u0002\u001a\u00020\u001d2\u0007\u0010¥\u0002\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¨\u0002\u0010\u0093\u0002\u001a\u0006\b©\u0002\u0010 \u0001R\u0017\u0010U\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010ª\u0002R*\u0010«\u0002\u001a\u00030ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0002\u0010õ\u0001\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R\u0019\u0010°\u0002\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u0019\u0010²\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010\u0093\u0002R=\u0010³\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010\u0099\u0002R\u0019\u0010´\u0002\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R=\u0010¶\u0002\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0J8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010û\u0001R0\u0010'\u001a\u00020\u001d2\u0007\u0010¥\u0002\u001a\u00020\u001d8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0093\u0002\u0012\u0006\b¸\u0002\u0010\u009a\u0001\u001a\u0006\b·\u0002\u0010 \u0001R2\u0010¹\u0002\u001a\u00020\u00062\u0007\u0010¥\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\b¹\u0002\u0010\u0086\u0002\u0012\u0006\b»\u0002\u0010\u009a\u0001\u001a\u0006\bº\u0002\u0010Ñ\u0001R\u0019\u0010¼\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010\u0086\u0002R\"\u0010½\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010\u0083\u0002R\u0019\u0010¾\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010\u0086\u0002R\u0019\u0010¿\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010\u0093\u0002R\u0019\u0010À\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010\u0093\u0002R\u0018\u0010Á\u0002\u001a\u00030\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010\u0089\u0002R>\u0010Â\u0002\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00020Kj\u0002`O0\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010\u0083\u0002R\u0019\u0010Ã\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010\u0086\u0002R\u0019\u0010Ä\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010\u0086\u0002R\u0019\u0010Å\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010\u0086\u0002R\u0019\u0010Æ\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010\u0086\u0002R\u001c\u0010u\u001a\u0004\u0018\u00010\t*\u00020?8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002R\u0017\u0010Ê\u0002\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010 \u0001R\u0017\u0010Ì\u0002\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010 \u0001R\u0018\u0010Ð\u0002\u001a\u00030Í\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010Ï\u0002R\u001f\u0010Ó\u0002\u001a\u00020\u001d8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bÒ\u0002\u0010\u009a\u0001\u001a\u0006\bÑ\u0002\u0010 \u0001R\u001f\u0010Ö\u0002\u001a\u00020\u001d8VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bÕ\u0002\u0010\u009a\u0001\u001a\u0006\bÔ\u0002\u0010 \u0001R\u0018\u0010Ú\u0002\u001a\u00030×\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u0017\u0010Ü\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\bÛ\u0002\u0010Ñ\u0001R\u0019\u0010ß\u0002\u001a\u0004\u0018\u00010]8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u0014\u0010á\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\bà\u0002\u0010 \u0001R\u001a\u0010ä\u0002\u001a\u0005\u0018\u00010ë\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u0019\u0010ç\u0002\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010æ\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ì\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Lbn/r;", "startRoot", "endRoot", "abortRoot", "", "key", "startGroup", "", "dataKey", "endGroup", "skipGroup", "group", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalScope", "(Ljava/lang/Integer;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "parentScope", "currentProviders", "updateProviderMapGroup", "T", "scope", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "ensureWriter", "createFreshInsertTable", "", "isNode", "data", "startReaderGroup", "objectKey", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "expectedNodeCount", "inserting", "exitGroup", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "newCount", "updateNodeCountOverrides", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "skipReaderToGroupEnd", "addRecomposeScope", "Landroidx/compose/runtime/MovableContent;", "content", "locals", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "force", "invokeMovableContentLambda", "R", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/Change;", "newChanges", "Lkotlin/Function0;", "block", "withChanges", "(Ljava/util/List;Lsn/a;)Ljava/lang/Object;", "reader", "withReader", "(Landroidx/compose/runtime/SlotReader;Lsn/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lsn/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "doCompose", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lsn/p;)V", "nodeAt", "validateNodeExpected", "validateNodeNotExpected", "change", "record", "recordApplierOperation", "recordSlotEditingOperation", "forParent", "recordSlotTableOperation", "realizeUps", "", "nodes", "realizeDowns", "([Ljava/lang/Object;)V", "node", "recordDown", "recordUp", "realizeOperationLocation", "Landroidx/compose/runtime/Anchor;", "anchor", "recordInsert", "recordFixup", "recordInsertUpFixup", "registerInsertUpFixup", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "location", "recordReaderMoving", "recordSlotEditing", "recordEndGroup", "recordEndRoot", "finalizeCompose", "cleanUpCompose", "nodeIndex", "recordRemoveNode", "recordMoveNode", "realizeMovement", "groupKey", "updateCompoundKeyWhenWeEnterGroup", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "startReplaceableGroup", "endReplaceableGroup", "startDefaults", "endDefaults", "startMovableGroup", "endMovableGroup", "changesApplied$runtime_release", "()V", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "Lkotlin/Function2;", "apply", "(Ljava/lang/Object;Lsn/p;)V", "left", "right", "joinKey", "nextSlot", Utils.VERB_CHANGED, "", "", "", "", "", "", "invalid", "cache", "(ZLsn/a;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", C4157n2.f33007p, "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "insertMovableContent", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "composeContent$runtime_release", "composeContent", "prepareCompose$runtime_release", "(Lsn/a;)V", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "applier", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "changes", "Ljava/util/List;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Stack;", "pending", "Landroidx/compose/runtime/Pending;", "I", "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "", "nodeCountOverrides", "[I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Z", "forciblyRecompose", "nodeExpected", "Landroidx/compose/runtime/Invalidation;", "entersStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "compositionToken", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "Landroidx/compose/runtime/SlotReader;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/d;", "getApplyCoroutineContext", "()Lkotlin/coroutines/d;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "recomposeScopeIdentity", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class ComposerImpl implements Composer {

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private List<q<Applier<?>, SlotWriter, RememberManager, r>> changes;
    private int childrenComposing;

    @NotNull
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;

    @NotNull
    private Stack<Object> downNodes;

    @NotNull
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;

    @NotNull
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;

    @NotNull
    private Anchor insertAnchor;

    @NotNull
    private final List<q<Applier<?>, SlotWriter, RememberManager, r>> insertFixups;

    @NotNull
    private SlotTable insertTable;

    @NotNull
    private final Stack<q<Applier<?>, SlotWriter, RememberManager, r>> insertUpFixups;
    private boolean inserting;

    @NotNull
    private final Stack<RecomposeScopeImpl> invalidateStack;

    @NotNull
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;

    @NotNull
    private List<q<Applier<?>, SlotWriter, RememberManager, r>> lateChanges;

    @Nullable
    private int[] nodeCountOverrides;

    @Nullable
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @NotNull
    private IntStack nodeIndexStack;

    @NotNull
    private final CompositionContext parentContext;

    @NotNull
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;

    @Nullable
    private Pending pending;

    @NotNull
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;

    @Nullable
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;

    @NotNull
    private final HashMap<Integer, PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;

    @NotNull
    private final IntStack providersInvalidStack;

    @NotNull
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;

    @NotNull
    private final SlotTable slotTable;

    @NotNull
    private Snapshot snapshot;
    private boolean startedGroup;

    @NotNull
    private final IntStack startedGroups;

    @NotNull
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "Lbn/r;", "onRemembered", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class CompositionContextHolder implements RememberObserver {

        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl compositionContextImpl) {
            p.k(compositionContextImpl, "ref");
            this.ref = compositionContextImpl;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\ba\u0010bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010&\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#H\u0010¢\u0006\u0004\b$\u0010%J.\u0010'\u001a\u00020\u00022&\u0010\u001b\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#J\u001d\u0010-\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u0002H\u0010¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0002H\u0010¢\u0006\u0004\b1\u0010/J\u0017\u00107\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b8\u00106J\u0019\u0010=\u001a\u0004\u0018\u00010:2\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u0010>\u001a\u00020:H\u0010¢\u0006\u0004\b?\u0010@R\u001a\u0010C\u001a\u00020B8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR0\u0010L\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010,R\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0(8\u0006¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010ORk\u0010Y\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#2&\u0010T\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\"0\u001fj\u0002`#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\b&\u0010%\"\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010`\u001a\u00020Z8PX\u0090\u0004¢\u0006\f\u0012\u0004\b_\u0010/\u001a\u0004\b^\u0010\\¨\u0006c"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "Lbn/r;", "dispose", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lsn/p;)V", "composeInitial", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", G5.Q, "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "", "compoundHashKey", "I", "getCompoundHashKey$runtime_release", "()I", "", "collectingParameterInformation", "Z", "getCollectingParameterInformation$runtime_release", "()Z", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope", "Lkotlin/coroutines/d;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/d;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;

        @NotNull
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState compositionLocalScope = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;

        @Nullable
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i10, boolean z10) {
            this.compoundHashKey = i10;
            this.collectingParameterInformation = z10;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull sn.p<? super Composer, ? super Integer, r> content) {
            p.k(composition, "composition");
            p.k(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            p.k(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release */
        public d getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Nullable
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public d getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            p.k(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
            p.k(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            p.k(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
            p.k(reference, "reference");
            p.k(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
            p.k(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
            p.k(table, G5.Q);
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@NotNull Composer composer) {
            p.k(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
            p.k(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(@Nullable Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@NotNull Composer composer) {
            p.k(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            y.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
            p.k(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            p.k(persistentMap, "scope");
            setCompositionLocalScope(persistentMap);
        }
    }

    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> set, @NotNull List<q<Applier<?>, SlotWriter, RememberManager, r>> list, @NotNull List<q<Applier<?>, SlotWriter, RememberManager, r>> list2, @NotNull ControlledComposition controlledComposition) {
        p.k(applier, "applier");
        p.k(compositionContext, "parentContext");
        p.k(slotTable, "slotTable");
        p.k(set, "abandonSet");
        p.k(list, "changes");
        p.k(list2, "lateChanges");
        p.k(controlledComposition, "composition");
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = list;
        this.lateChanges = list2;
        this.composition = controlledComposition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new HashMap<>();
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.invalidateStack = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th2) {
            slotReaderOpenReader2.close();
            throw th2;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        this.reader.close();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        if (getInserting()) {
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) getComposition());
            this.invalidateStack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.compositionToken);
            return;
        }
        Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (p.f(next, Composer.INSTANCE.getEmpty())) {
            recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) getComposition());
            updateValue(recomposeScopeImpl);
        } else {
            if (next == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            }
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        recomposeScopeImpl.setRequiresRecompose(invalidationRemoveLocation != null);
        this.invalidateStack.push(recomposeScopeImpl);
        recomposeScopeImpl.start(this.compositionToken);
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return iGroupCompoundKeyPart == 126665345 ? iGroupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ iGroupCompoundKeyPart;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope(Integer group) {
        PersistentMap persistentMap;
        if (group == null && (persistentMap = this.providerCache) != null) {
            return persistentMap;
        }
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && p.f(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    if (objGroupAux == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupAux;
                    this.providerCache = persistentMap2;
                    return persistentMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            int iIntValue = group != null ? group.intValue() : this.reader.getParent();
            while (iIntValue > 0) {
                if (this.reader.groupKey(iIntValue) == 202 && p.f(this.reader.groupObjectKey(iIntValue), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap3 = this.providerUpdates.get(Integer.valueOf(iIntValue));
                    if (persistentMap3 == null) {
                        Object objGroupAux2 = this.reader.groupAux(iIntValue);
                        if (objGroupAux2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        persistentMap3 = (PersistentMap) objGroupAux2;
                    }
                    this.providerCache = persistentMap3;
                    return persistentMap3;
                }
                iIntValue = this.reader.parent(iIntValue);
            }
        }
        PersistentMap persistentMap4 = this.parentProvider;
        this.providerCache = persistentMap4;
        return persistentMap4;
    }

    public static /* synthetic */ PersistentMap currentCompositionLocalScope$default(ComposerImpl composerImpl, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return composerImpl.currentCompositionLocalScope(num);
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, final sn.p<? super Composer, ? super Integer, r> content) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            this.snapshot = snapshotCurrentSnapshot;
            this.compositionToken = snapshotCurrentSnapshot.getId();
            this.providerUpdates.clear();
            int size = invalidationsRequested.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = invalidationsRequested.getKeys()[i10];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                }
                IdentityArraySet identityArraySet = (IdentityArraySet) invalidationsRequested.getValues()[i10];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                Anchor anchor = recomposeScopeImpl.getAnchor();
                if (anchor == null) {
                    return;
                }
                this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation(), identityArraySet));
            }
            List<Invalidation> list = this.invalidations;
            if (list.size() > 1) {
                a0.D(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda-37$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return b.d(Integer.valueOf(((Invalidation) t10).getLocation()), Integer.valueOf(((Invalidation) t11).getLocation()));
                    }
                });
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                final Object objNextSlot = nextSlot();
                if (objNextSlot != content && content != null) {
                    updateValue(content);
                }
                SnapshotStateKt.observeDerivedStateRecalculations(new l<State<?>, r>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(State<?> state) {
                        invoke2(state);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull State<?> state) {
                        p.k(state, "it");
                        this.this$0.childrenComposing++;
                    }
                }, new l<State<?>, r>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(State<?> state) {
                        invoke2(state);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull State<?> state) {
                        p.k(state, "it");
                        ComposerImpl composerImpl = this.this$0;
                        composerImpl.childrenComposing--;
                    }
                }, new a<r>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2;
                        if (content != null) {
                            this.startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, content);
                            this.endGroup();
                        } else {
                            if (!this.forciblyRecompose || (obj2 = objNextSlot) == null || p.f(obj2, Composer.INSTANCE.getEmpty())) {
                                this.skipCurrentGroup();
                                return;
                            }
                            this.startGroup(200, ComposerKt.getInvocation());
                            ComposerImpl composerImpl = this;
                            Object obj3 = objNextSlot;
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                            }
                            ActualJvm_jvmKt.invokeComposable(composerImpl, (sn.p) y.e(obj3, 2));
                            this.endGroup();
                        }
                    }
                });
                endRoot();
                this.isComposing = false;
                this.invalidations.clear();
                r rVar = r.f5635a;
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                abortRoot();
                throw th2;
            }
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    private final void doRecordDownsFor(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i10), i11);
        if (this.reader.isNode(i10)) {
            recordDown(nodeAt(this.reader, i10));
        }
    }

    private final void end(boolean z10) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i10 = this.groupNodeCount;
        Pending pending = this.pending;
        int i11 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i12 = 0;
            int i13 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i12 < size2) {
                KeyInfo keyInfo = keyInfos.get(i12);
                if (setFastToSet.contains(keyInfo)) {
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i13 < size) {
                            KeyInfo keyInfo2 = used.get(i13);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    recordMoveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i12++;
                            }
                            i13++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            used = list;
                        }
                    }
                    i11 = 0;
                } else {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i11);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i12++;
                i11 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i14 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int current = this.reader.getCurrent();
            recordDelete();
            recordRemoveNode(i14, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z10) {
                registerInsertUpFixup();
                i10 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i10);
                }
            }
        } else {
            if (z10) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i10 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i10, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z10, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z10) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i10, boolean z10) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !z10) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.nodeIndexStack.pop() + i10;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i10;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i10) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i10)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i10);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = slotReader.groupKey(i10);
        if (iGroupKey == 207 && (objGroupAux = slotReader.groupAux(i10)) != null && !p.f(objGroupAux, Composer.INSTANCE.getEmpty())) {
            iGroupKey = objGroupAux.hashCode();
        }
        return iGroupKey;
    }

    private static final int insertMovableContentReferences$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int insertMovableContentReferences$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        insertMovableContentReferences$positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iInsertMovableContentReferences$currentNodeIndex = insertMovableContentReferences$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iInsertMovableContentReferences$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iInsertMovableContentReferences$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iInsertMovableContentReferences$currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertMovableContentReferences$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i10) {
        while (!slotWriter.indexInParent(i10)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> movableContent, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, final Object obj, boolean z10) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        changed(obj);
        int compoundKeyHash = getCompoundKeyHash();
        this.compoundKeyHash = MovableContentKt.movableContentKey;
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        boolean z11 = (getInserting() || p.f(this.reader.getGroupAux(), persistentMap)) ? false : true;
        if (z11) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), persistentMap);
        }
        start(202, ComposerKt.getCompositionLocalMap(), false, persistentMap);
        if (!getInserting() || z10) {
            boolean z12 = this.providersInvalid;
            this.providersInvalid = z11;
            ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(1378964644, true, new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                @Composable
                public final void invoke(@Nullable Composer composer, int i10) {
                    if ((i10 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        movableContent.getContent().invoke(obj, composer, 8);
                    }
                }
            }));
            this.providersInvalid = z12;
        } else {
            this.writerHasAProvider = true;
            this.providerCache = null;
            SlotWriter slotWriter = this.writer;
            this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), w.m(), currentCompositionLocalScope$default(this, null, 1, null)));
        }
        endGroup();
        this.compoundKeyHash = compoundKeyHash;
        endMovableGroup();
    }

    private final Object nodeAt(SlotReader slotReader, int i10) {
        return slotReader.node(i10);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.realizeDowns.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                p.k(applier, "applier");
                p.k(slotWriter, "<anonymous parameter 1>");
                p.k(rememberManager, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i10 = 0; i10 < length; i10++) {
                    applier.down(nodes[i10]);
                }
            }
        });
    }

    private final void realizeMovement() {
        final int i10 = this.previousCount;
        this.previousCount = 0;
        if (i10 > 0) {
            final int i11 = this.previousRemove;
            if (i11 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // sn.q
                    public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                        p.k(applier, "applier");
                        p.k(slotWriter, "<anonymous parameter 1>");
                        p.k(rememberManager, "<anonymous parameter 2>");
                        applier.remove(i11, i10);
                    }
                });
                return;
            }
            final int i12 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i13 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "applier");
                    p.k(slotWriter, "<anonymous parameter 1>");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    applier.move(i12, i13, i10);
                }
            });
        }
    }

    private final void realizeOperationLocation(boolean z10) {
        int parent = z10 ? this.reader.getParent() : this.reader.getCurrent();
        final int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        }
        if (i10 > 0) {
            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.realizeOperationLocation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "slots");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    slotWriter.advanceBy(i10);
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.realizeOperationLocation(z10);
    }

    private final void realizeUps() {
        final int i10 = this.pendingUps;
        if (i10 > 0) {
            this.pendingUps = 0;
            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.realizeUps.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "applier");
                    p.k(slotWriter, "<anonymous parameter 1>");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    int i11 = i10;
                    for (int i12 = 0; i12 < i11; i12++) {
                        applier.up();
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x0007, B:5:0x0014, B:7:0x0028, B:8:0x002c, B:10:0x0032, B:12:0x003e, B:11:0x003a, B:15:0x0045, B:17:0x004b, B:19:0x0051), top: B:25:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r9, androidx.compose.runtime.ControlledComposition r10, java.lang.Integer r11, java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>>> r12, sn.a<? extends R> r13) {
        /*
            r8 = this;
            boolean r0 = r8.implicitRootStart
            boolean r1 = r8.isComposing
            int r2 = r8.nodeIndex
            r3 = 0
            r8.implicitRootStart = r3     // Catch: java.lang.Throwable -> L5c
            r4 = 1
            r8.isComposing = r4     // Catch: java.lang.Throwable -> L5c
            r8.nodeIndex = r3     // Catch: java.lang.Throwable -> L5c
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L5c
        L12:
            if (r3 >= r4) goto L41
            java.lang.Object r5 = r12.get(r3)     // Catch: java.lang.Throwable -> L5c
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r5.component1()     // Catch: java.lang.Throwable -> L5c
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.component2()     // Catch: java.lang.Throwable -> L5c
            androidx.compose.runtime.collection.IdentityArraySet r5 = (androidx.compose.runtime.collection.IdentityArraySet) r5     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L3a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5c
        L2c:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L5c
            r8.tryImminentInvalidation$runtime_release(r6, r7)     // Catch: java.lang.Throwable -> L5c
            goto L2c
        L3a:
            r5 = 0
            r8.tryImminentInvalidation$runtime_release(r6, r5)     // Catch: java.lang.Throwable -> L5c
        L3e:
            int r3 = r3 + 1
            goto L12
        L41:
            if (r9 == 0) goto L51
            if (r11 == 0) goto L4a
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5c
            goto L4b
        L4a:
            r11 = -1
        L4b:
            java.lang.Object r9 = r9.delegateInvalidations(r10, r11, r13)     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L55
        L51:
            java.lang.Object r9 = r13.invoke()     // Catch: java.lang.Throwable -> L5c
        L55:
            r8.implicitRootStart = r0
            r8.isComposing = r1
            r8.nodeIndex = r2
            return r9
        L5c:
            r9 = move-exception
            r8.implicitRootStart = r0
            r8.isComposing = r1
            r8.nodeIndex = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, sn.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, a aVar, int i10, Object obj) {
        ControlledComposition controlledComposition3 = (i10 & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i10 & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = w.m();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, aVar);
    }

    private final void recomposeToGroupEnd() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i10 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.groupNodeCount;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        boolean z11 = false;
        int i12 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int current = this.reader.getCurrent();
                recordUpsAndDowns(i12, current, parent);
                this.nodeIndex = nodeIndexOf(location, current, parent, i10);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(current), parent, compoundKeyHash);
                this.providerCache = null;
                invalidationFirstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i12 = current;
                z11 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        }
        if (z11) {
            recordUpsAndDowns(i12, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i10 + iUpdatedNodeCount;
            this.groupNodeCount = i11 + iUpdatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    private final void record(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        this.changes.add(qVar);
    }

    private final void recordApplierOperation(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        realizeUps();
        realizeDowns();
        record(qVar);
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrent());
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object obj) {
        this.downNodes.push(obj);
    }

    private final void recordEndGroup() {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
        }
    }

    private final void recordEndRoot() {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        this.insertFixups.add(qVar);
    }

    private final void recordInsert(final Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "slots");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    slotWriter.beginInsert();
                    SlotTable slotTable2 = slotTable;
                    slotWriter.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slotWriter.endInsert();
                }
            });
            return;
        }
        final List listJ1 = f0.j1(this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                p.k(applier, "applier");
                p.k(slotWriter, "slots");
                p.k(rememberManager, "rememberManager");
                SlotTable slotTable3 = slotTable2;
                List<q<Applier<?>, SlotWriter, RememberManager, r>> list = listJ1;
                SlotWriter slotWriterOpenWriter = slotTable3.openWriter();
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke(applier, slotWriterOpenWriter, rememberManager);
                    }
                    r rVar = r.f5635a;
                    slotWriterOpenWriter.close();
                    slotWriter.beginInsert();
                    SlotTable slotTable4 = slotTable2;
                    slotWriter.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slotWriter.endInsert();
                } catch (Throwable th2) {
                    slotWriterOpenWriter.close();
                    throw th2;
                }
            }
        });
    }

    private final void recordInsertUpFixup(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        this.insertUpFixups.push(qVar);
    }

    private final void recordMoveNode(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.previousCount;
            if (i13 > 0 && this.previousMoveFrom == i10 - i13 && this.previousMoveTo == i11 - i13) {
                this.previousCount = i13 + i12;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = i10;
            this.previousMoveTo = i11;
            this.previousCount = i12;
        }
    }

    private final void recordReaderMoving(int i10) {
        this.writersReaderDelta = i10 - (this.reader.getCurrent() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + i10).toString());
                throw new KotlinNothingValueException();
            }
            if (this.previousRemove == i10) {
                this.previousCount += i11;
                return;
            }
            realizeMovement();
            this.previousRemove = i10;
            this.previousCount = i11;
        }
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.peekOr(-1) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
            this.startedGroup = true;
        }
        final Anchor anchor = slotReader.anchor(parent);
        this.startedGroups.push(parent);
        recordSlotTableOperation$default(this, false, new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.recordSlotEditing.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                p.k(applier, "<anonymous parameter 0>");
                p.k(slotWriter, "slots");
                p.k(rememberManager, "<anonymous parameter 2>");
                slotWriter.ensureStarted(anchor);
            }
        }, 1, null);
    }

    private final void recordSlotEditingOperation(q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(qVar);
    }

    private final void recordSlotTableOperation(boolean z10, q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, r> qVar) {
        realizeOperationLocation(z10);
        record(qVar);
    }

    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z10, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.recordSlotTableOperation(z10, qVar);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int i10, int i11, int i12) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i10, i11, i12);
        while (i10 > 0 && i10 != iNearestCommonRootOf) {
            if (slotReader.isNode(i10)) {
                recordUp();
            }
            i10 = slotReader.parent(i10);
        }
        doRecordDownsFor(i11, iNearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    private final void reportFreeMovableContent(int i10) {
        reportFreeMovableContent$reportGroup(this, i10, false, 0);
        realizeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(final ComposerImpl composerImpl, int i10, boolean z10, int i11) {
        if (!composerImpl.reader.hasMark(i10)) {
            if (!composerImpl.reader.containsMark(i10)) {
                return composerImpl.reader.nodeCount(i10);
            }
            int iGroupSize = composerImpl.reader.groupSize(i10) + i10;
            int iGroupSize2 = i10 + 1;
            int iReportFreeMovableContent$reportGroup = 0;
            while (iGroupSize2 < iGroupSize) {
                boolean zIsNode = composerImpl.reader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, iGroupSize2, zIsNode || z10, zIsNode ? 0 : i11 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
            }
            return iReportFreeMovableContent$reportGroup;
        }
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i10);
        if (objGroupObjectKey == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        }
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet = composerImpl.reader.groupGet(i10, 0);
        final Anchor anchor = composerImpl.reader.anchor(i10);
        List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i10, composerImpl.reader.groupSize(i10) + i10);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i12 = 0; i12 < size; i12++) {
            Invalidation invalidation = (Invalidation) listFilterToRange.get(i12);
            arrayList.add(h.a(invalidation.getScope(), invalidation.getInstances()));
        }
        final MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, objGroupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(Integer.valueOf(i10)));
        composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        composerImpl.recordSlotEditing();
        composerImpl.record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                p.k(applier, "<anonymous parameter 0>");
                p.k(slotWriter, "slots");
                p.k(rememberManager, "<anonymous parameter 2>");
                SlotTable slotTable = new SlotTable();
                Anchor anchor2 = anchor;
                SlotWriter slotWriterOpenWriter = slotTable.openWriter();
                try {
                    slotWriterOpenWriter.beginInsert();
                    slotWriter.moveTo(anchor2, 1, slotWriterOpenWriter);
                    slotWriterOpenWriter.endInsert();
                    r rVar = r.f5635a;
                    slotWriterOpenWriter.close();
                    this.this$0.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, new MovableContentState(slotTable));
                } catch (Throwable th2) {
                    slotWriterOpenWriter.close();
                    throw th2;
                }
            }
        });
        if (!z10) {
            return composerImpl.reader.nodeCount(i10);
        }
        composerImpl.realizeMovement();
        composerImpl.realizeUps();
        composerImpl.realizeDowns();
        int iNodeCount = composerImpl.reader.isNode(i10) ? 1 : composerImpl.reader.nodeCount(i10);
        if (iNodeCount <= 0) {
            return 0;
        }
        composerImpl.recordRemoveNode(i11, iNodeCount);
        return 0;
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        return ComposerKt.contains(scope, key) ? (T) ComposerKt.getValueOf(scope, key) : key.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final void start(int i10, Object obj, boolean z10, Object obj2) {
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i10, obj, obj2);
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z10) {
                this.writer.startNode(Composer.INSTANCE.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj == null) {
                    obj = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(i10, obj, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj == null) {
                    obj = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(i10, obj);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i10, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z10, null);
            return;
        }
        if (this.pending == null) {
            if (this.reader.getGroupKey() == i10 && p.f(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z10, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i10, obj);
            if (next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int iSlotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = iSlotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(iSlotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.start.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // sn.q
                        public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter3, RememberManager rememberManager) {
                            invoke2(applier, slotWriter3, rememberManager);
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter3, @NotNull RememberManager rememberManager) {
                            p.k(applier, "<anonymous parameter 0>");
                            p.k(slotWriter3, "slots");
                            p.k(rememberManager, "<anonymous parameter 2>");
                            slotWriter3.moveGroup(groupIndex);
                        }
                    });
                }
                startReaderGroup(z10, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z10) {
                    this.writer.startNode(Composer.INSTANCE.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj == null) {
                        obj = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(i10, obj, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj == null) {
                        obj = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(i10, obj);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i10, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z10 ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z10, pending);
    }

    private final void startGroup(int i10) {
        start(i10, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int i10, Object obj) {
        start(i10, obj, false, null);
    }

    private final void startReaderGroup(boolean z10, final Object obj) {
        if (z10) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            recordSlotTableOperation$default(this, false, new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.startReaderGroup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "slots");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    slotWriter.updateAux(obj);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || p.f(obj2, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(i10);
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i10) {
        this.compoundKeyHash = i10 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || p.f(obj2, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeExitGroupKeyHash(i10);
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i10) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i10) ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i10, int i11) {
        if (updatedNodeCount(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                cn.p.x(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i10] = i11;
        }
    }

    private final void updateNodeCountOverrides(int i10, int i11) {
        int iUpdatedNodeCount = updatedNodeCount(i10);
        if (iUpdatedNodeCount != i11) {
            int i12 = i11 - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i10 != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(i10) + i12;
                updateNodeCount(i10, iUpdatedNodeCount2);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        Pending pendingPeek = this.pendingStack.peek(i13);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(i10, iUpdatedNodeCount2)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.reader.getParent();
                } else if (this.reader.isNode(i10)) {
                    return;
                } else {
                    i10 = this.reader.parent(i10);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap persistentMapBuild = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        changed(persistentMapBuild);
        changed(currentProviders);
        endGroup();
        return persistentMapBuild;
    }

    private final int updatedNodeCount(int group) {
        int i10;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i10 = iArr[group]) < 0) ? this.reader.nodeCount(group) : i10;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final <R> R withChanges(List<q<Applier<?>, SlotWriter, RememberManager, r>> newChanges, a<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return block.invoke();
        } finally {
            n.b(1);
            this.changes = list;
            n.a(1);
        }
    }

    private final <R> R withReader(SlotReader reader, a<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            n.b(1);
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            n.a(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, @NotNull final sn.p<? super T, ? super V, r> block) {
        p.k(block, "block");
        q<Applier<?>, SlotWriter, RememberManager, r> qVar = new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Applier<?> r2, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotWriter r3, @org.jetbrains.annotations.NotNull androidx.compose.runtime.RememberManager r4) {
                /*
                    r1 = this;
                    java.lang.String r0 = "applier"
                    tn.p.k(r2, r0)
                    java.lang.String r0 = "<anonymous parameter 1>"
                    tn.p.k(r3, r0)
                    java.lang.String r3 = "<anonymous parameter 2>"
                    tn.p.k(r4, r3)
                    sn.p<T, V, bn.r> r3 = r1
                    java.lang.Object r2 = r2.getCurrent()
                    V r4 = r2
                    r3.mo2invoke(r2, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$apply$operation$1.invoke2(androidx.compose.runtime.Applier, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager):void");
            }
        };
        if (getInserting()) {
            recordFixup(qVar);
        } else {
            recordApplierOperation(qVar);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope$default(this, null, 1, null));
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, @NotNull a<? extends T> block) {
        p.k(block, "block");
        T t10 = (T) nextSlot();
        if (t10 != Composer.INSTANCE.getEmpty() && !invalid) {
            return t10;
        }
        T tInvoke = block.invoke();
        updateValue(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Double) {
            if (value == ((Number) objNextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Float) {
            if (value == ((Number) objNextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object value) {
        if (p.f(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final void composeContent$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, @NotNull sn.p<? super Composer, ? super Integer, r> content) {
        p.k(invalidationsRequested, "invalidationsRequested");
        p.k(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        p.k(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope$default(this, null, 1, null));
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull final a<? extends T> aVar) {
        p.k(aVar, "factory");
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
            throw new KotlinNothingValueException();
        }
        final int iPeek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter2, @NotNull RememberManager rememberManager) {
                p.k(applier, "applier");
                p.k(slotWriter2, "slots");
                p.k(rememberManager, "<anonymous parameter 2>");
                Object objInvoke = aVar.invoke();
                slotWriter2.updateNode(anchor, objInvoke);
                applier.insertTopDown(iPeek, objInvoke);
                applier.down(objInvoke);
            }
        });
        recordInsertUpFixup(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter2, @NotNull RememberManager rememberManager) {
                p.k(applier, "applier");
                p.k(slotWriter2, "slots");
                p.k(rememberManager, "<anonymous parameter 2>");
                Object objNode = slotWriter2.node(anchor);
                applier.up();
                applier.insertBottomUp(iPeek, objNode);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z10) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (getInserting()) {
            return;
        }
        if (!z10) {
            skipReaderToGroupEnd();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        for (final int i10 = current; i10 < end; i10++) {
            this.reader.forEachData$runtime_release(i10, new sn.p<Integer, Object, r>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Integer num, Object obj) {
                    invoke(num.intValue(), obj);
                    return r.f5635a;
                }

                public final void invoke(final int i11, @Nullable final Object obj) {
                    if (obj instanceof RememberObserver) {
                        ComposerImpl.this.reader.reposition(i10);
                        ComposerImpl composerImpl = ComposerImpl.this;
                        final int i12 = i10;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // sn.q
                            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                p.k(applier, "<anonymous parameter 0>");
                                p.k(slotWriter, "slots");
                                p.k(rememberManager, "rememberManager");
                                if (!p.f(obj, slotWriter.slot(i12, i11))) {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                                rememberManager.forgetting((RememberObserver) obj);
                                slotWriter.set(i11, Composer.INSTANCE.getEmpty());
                            }
                        }, 1, null);
                        return;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        CompositionImpl composition = recomposeScopeImpl.getComposition();
                        if (composition != null) {
                            composition.setPendingInvalidScopes$runtime_release(true);
                            recomposeScopeImpl.release();
                        }
                        ComposerImpl.this.reader.reposition(i10);
                        ComposerImpl composerImpl2 = ComposerImpl.this;
                        final int i13 = i10;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // sn.q
                            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                p.k(applier, "<anonymous parameter 0>");
                                p.k(slotWriter, "slots");
                                p.k(rememberManager, "<anonymous parameter 2>");
                                if (p.f(obj, slotWriter.slot(i13, i11))) {
                                    slotWriter.set(i11, Composer.INSTANCE.getEmpty());
                                } else {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                            }
                        }, 1, null);
                    }
                }
            });
        }
        ComposerKt.removeRange(this.invalidations, current, end);
        this.reader.reposition(current);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            r rVar = r.f5635a;
            trace.endSection(objBeginSection);
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        final l<Composition, r> lVarEnd;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (lVarEnd = recomposeScopeImplPop.end(this.compositionToken)) != null) {
            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "<anonymous parameter 1>");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    lVarEnd.invoke(this.getComposition());
                }
            });
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public d getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (!(currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid())) {
                return false;
            }
        }
        return true;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (!getInserting() && !this.reusing && !this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (((currentRecomposeScope$runtime_release == null || currentRecomposeScope$runtime_release.getRequiresRecompose()) ? false : true) && !this.forciblyRecompose) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent<?> movableContent, @Nullable Object obj) {
        p.k(movableContent, "value");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope$default(this, null, 1, null), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        final SlotReader slotReaderOpenReader;
        List list2;
        p.k(list, "references");
        List<q<Applier<?>, SlotWriter, RememberManager, r>> list3 = this.lateChanges;
        List list4 = this.changes;
        try {
            this.changes = list3;
            record(ComposerKt.resetSlotsInstance);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i10);
                final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                final MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                final Anchor anchor = movableContentStateReferenceComponent1.getAnchor();
                int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                realizeUps();
                record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // sn.q
                    public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                        p.k(applier, "applier");
                        p.k(slotWriter, "slots");
                        p.k(rememberManager, "<anonymous parameter 2>");
                        ref$IntRef.element = ComposerImpl.insertMovableContentReferences$positionToInsert(slotWriter, anchor, applier);
                    }
                });
                if (movableContentStateReferenceComponent2 == null) {
                    if (p.f(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                    try {
                        slotReaderOpenReader.reposition(iAnchorIndex);
                        this.writersReaderDelta = iAnchorIndex;
                        final ArrayList arrayList = new ArrayList();
                        recomposeMovableContent$default(this, null, null, null, null, new a<r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // sn.a
                            public /* bridge */ /* synthetic */ r invoke() {
                                invoke2();
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ComposerImpl composerImpl = this.this$0;
                                List<q<Applier<?>, SlotWriter, RememberManager, r>> list5 = arrayList;
                                SlotReader slotReader = slotReaderOpenReader;
                                MovableContentStateReference movableContentStateReference = movableContentStateReferenceComponent1;
                                List list6 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list5;
                                    SlotReader slotReader2 = composerImpl.reader;
                                    int[] iArr = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader;
                                        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter(), true);
                                        r rVar = r.f5635a;
                                    } finally {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                    }
                                } finally {
                                    composerImpl.changes = list6;
                                }
                            }
                        }, 15, null);
                        if (!arrayList.isEmpty()) {
                            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // sn.q
                                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return r.f5635a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                    p.k(applier, "applier");
                                    p.k(slotWriter, "slots");
                                    p.k(rememberManager, "rememberManager");
                                    int i11 = ref$IntRef.element;
                                    if (i11 > 0) {
                                        applier = new OffsetApplier(applier, i11);
                                    }
                                    List<q<Applier<?>, SlotWriter, RememberManager, r>> list5 = arrayList;
                                    int size2 = list5.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        list5.get(i12).invoke(applier, slotWriter, rememberManager);
                                    }
                                }
                            });
                        }
                        r rVar = r.f5635a;
                        slotReaderOpenReader.close();
                    } finally {
                    }
                } else {
                    final List listCollectNodesFrom = ComposerKt.collectNodesFrom(movableContentStateReferenceComponent2.getSlotTable(), movableContentStateReferenceComponent2.getAnchor());
                    if (!listCollectNodesFrom.isEmpty()) {
                        record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // sn.q
                            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                p.k(applier, "applier");
                                p.k(slotWriter, "<anonymous parameter 1>");
                                p.k(rememberManager, "<anonymous parameter 2>");
                                int i11 = ref$IntRef.element;
                                List<Object> list5 = listCollectNodesFrom;
                                int size2 = list5.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    Object obj = list5.get(i12);
                                    int i13 = i11 + i12;
                                    applier.insertBottomUp(i13, obj);
                                    applier.insertTopDown(i13, obj);
                                }
                            }
                        });
                        int iAnchorIndex2 = this.slotTable.anchorIndex(anchor);
                        updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                    }
                    record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // sn.q
                        public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            invoke2(applier, slotWriter, rememberManager);
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                            p.k(applier, "<anonymous parameter 0>");
                            p.k(slotWriter, "slots");
                            p.k(rememberManager, "<anonymous parameter 2>");
                            MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.this$0.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                            if (movableContentStateMovableContentStateResolve$runtime_release == null) {
                                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                                throw new KotlinNothingValueException();
                            }
                            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release.getSlotTable(), 1);
                            if (true ^ listMoveIntoGroupFrom.isEmpty()) {
                                CompositionImpl compositionImpl = (CompositionImpl) movableContentStateReferenceComponent1.getComposition();
                                int size2 = listMoveIntoGroupFrom.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    Object objSlot = slotWriter.slot(listMoveIntoGroupFrom.get(i11), 0);
                                    RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                                    if (recomposeScopeImpl != null) {
                                        recomposeScopeImpl.adoptedBy(compositionImpl);
                                    }
                                }
                            }
                        }
                    });
                    SlotTable slotTable = movableContentStateReferenceComponent2.getSlotTable();
                    slotReaderOpenReader = slotTable.openReader();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = slotReaderOpenReader;
                            int iAnchorIndex3 = slotTable.anchorIndex(movableContentStateReferenceComponent2.getAnchor());
                            slotReaderOpenReader.reposition(iAnchorIndex3);
                            this.writersReaderDelta = iAnchorIndex3;
                            final ArrayList arrayList2 = new ArrayList();
                            List list5 = this.changes;
                            try {
                                this.changes = arrayList2;
                                list2 = list5;
                                try {
                                    recomposeMovableContent(movableContentStateReferenceComponent2.getComposition(), movableContentStateReferenceComponent1.getComposition(), Integer.valueOf(slotReaderOpenReader.getCurrent()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new a<r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // sn.a
                                        public /* bridge */ /* synthetic */ r invoke() {
                                            invoke2();
                                            return r.f5635a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            this.this$0.invokeMovableContentLambda(movableContentStateReferenceComponent1.getContent$runtime_release(), movableContentStateReferenceComponent1.getLocals$runtime_release(), movableContentStateReferenceComponent1.getParameter(), true);
                                        }
                                    });
                                    r rVar2 = r.f5635a;
                                    this.changes = list2;
                                    if (!arrayList2.isEmpty()) {
                                        record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$5$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // sn.q
                                            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                                invoke2(applier, slotWriter, rememberManager);
                                                return r.f5635a;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                                p.k(applier, "applier");
                                                p.k(slotWriter, "slots");
                                                p.k(rememberManager, "rememberManager");
                                                int i11 = ref$IntRef.element;
                                                if (i11 > 0) {
                                                    applier = new OffsetApplier(applier, i11);
                                                }
                                                List<q<Applier<?>, SlotWriter, RememberManager, r>> list6 = arrayList2;
                                                int size2 = list6.size();
                                                for (int i12 = 0; i12 < size2; i12++) {
                                                    list6.get(i12).invoke(applier, slotWriter, rememberManager);
                                                }
                                            }
                                        });
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    this.changes = list2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                list2 = list5;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                record(ComposerKt.skipToGroupEndInstance);
            }
            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$2
                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "applier");
                    p.k(slotWriter, "slots");
                    p.k(rememberManager, "<anonymous parameter 2>");
                    ComposerImpl.insertMovableContentReferences$positionToParentOf(slotWriter, applier, 0);
                    slotWriter.endGroup();
                }
            });
            this.writersReaderDelta = 0;
            r rVar3 = r.f5635a;
            this.changes = list4;
            cleanUpCompose();
        } catch (Throwable th4) {
            this.changes = list4;
            throw th4;
        }
    }

    /* JADX INFO: renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object left, @Nullable Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    @Nullable
    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull a<r> block) {
        p.k(block, "block");
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        p.k(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
        if (!invalidationsRequested.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
            return false;
        }
        doCompose(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull final a<r> aVar) {
        p.k(aVar, "effect");
        record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.recordSideEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                p.k(applier, "<anonymous parameter 0>");
                p.k(slotWriter, "<anonymous parameter 1>");
                p.k(rememberManager, "rememberManager");
                rememberManager.sideEffect(aVar);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope recomposeScope) {
        p.k(recomposeScope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlot();
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable) {
        p.k(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String str) {
        p.k(str, "sourceInformation");
        if (getInserting()) {
            this.writer.insertAux(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i10, @NotNull String str) {
        p.k(str, "sourceInformation");
        start(i10, null, false, str);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        start(-127, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i10, @Nullable Object obj) {
        start(i10, obj, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        int i10 = 126;
        if (getInserting() || (!this.reusing ? this.reader.getGroupKey() != 126 : this.reader.getGroupKey() != 125)) {
            i10 = 125;
        }
        start(i10, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull final ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapUpdateProviderMapGroup;
        boolean z10;
        p.k(values, "values");
        final PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMapCurrentCompositionLocalScope$default = currentCompositionLocalScope$default(this, null, 1, null);
        startGroup(201, ComposerKt.getProvider());
        startGroup(203, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new sn.p<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Composable
            @NotNull
            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(@Nullable Composer composer, int i10) {
                composer.startReplaceableGroup(935231726);
                PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCompositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, persistentMapCurrentCompositionLocalScope$default, composer, 8);
                composer.endReplaceableGroup();
                return persistentMapCompositionLocalMapOf;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> mo2invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }
        });
        endGroup();
        if (getInserting()) {
            persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope$default, persistentMap);
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            if (objGroupGet == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            if (objGroupGet2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap persistentMap3 = (PersistentMap) objGroupGet2;
            if (!getSkipping() || !p.f(persistentMap3, persistentMap)) {
                persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope$default, persistentMap);
                z10 = !p.f(persistentMapUpdateProviderMapGroup, persistentMap2);
                if (z10 && !getInserting()) {
                    this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), persistentMapUpdateProviderMapGroup);
                }
                this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
                this.providersInvalid = z10;
                this.providerCache = persistentMapUpdateProviderMapGroup;
                start(202, ComposerKt.getCompositionLocalMap(), false, persistentMapUpdateProviderMapGroup);
            }
            skipGroup();
            persistentMapUpdateProviderMapGroup = persistentMap2;
        }
        z10 = false;
        if (z10) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrent()), persistentMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z10;
        this.providerCache = persistentMapUpdateProviderMapGroup;
        start(202, ComposerKt.getCompositionLocalMap(), false, persistentMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i10) {
        start(i10, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int key) {
        start(key, null, false, null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i10, @Nullable Object obj) {
        if (this.reader.getGroupKey() == i10 && !p.f(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        start(i10, null, false, obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        start(125, null, true, null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        p.k(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrent()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    public final void updateCachedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    public final void updateValue(@Nullable final Object obj) {
        if (!getInserting()) {
            final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (obj instanceof RememberObserver) {
                this.abandonSet.add(obj);
            }
            recordSlotTableOperation(true, new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    RecomposeScopeImpl recomposeScopeImpl;
                    CompositionImpl composition;
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "slots");
                    p.k(rememberManager, "rememberManager");
                    Object obj2 = obj;
                    if (obj2 instanceof RememberObserver) {
                        rememberManager.remembering((RememberObserver) obj2);
                    }
                    Object obj3 = slotWriter.set(groupSlotIndex, obj);
                    if (obj3 instanceof RememberObserver) {
                        rememberManager.forgetting((RememberObserver) obj3);
                    } else {
                        if (!(obj3 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj3).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.release();
                        composition.setPendingInvalidScopes$runtime_release(true);
                    }
                }
            });
            return;
        }
        this.writer.update(obj);
        if (obj instanceof RememberObserver) {
            record(new q<Applier<?>, SlotWriter, RememberManager, r>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ r invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    p.k(applier, "<anonymous parameter 0>");
                    p.k(slotWriter, "<anonymous parameter 1>");
                    p.k(rememberManager, "rememberManager");
                    rememberManager.remembering((RememberObserver) obj);
                }
            });
            this.abandonSet.add(obj);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            recordDown(getNode(this.reader));
        } else {
            ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }
}
