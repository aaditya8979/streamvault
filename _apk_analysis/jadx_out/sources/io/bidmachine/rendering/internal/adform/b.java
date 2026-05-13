package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.measurer.CompositeHtmlMeasurer;
import io.bidmachine.rendering.measurer.CompositeVideoMeasurer;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.MeasurerParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f70042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f70043b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70044a;

        static {
            int[] iArr = new int[AdElementType.values().length];
            try {
                iArr[AdElementType.Mraid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdElementType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdElementType.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdElementType.Label.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdElementType.Progress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdElementType.Countdown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f70044a = iArr;
        }
    }

    public b(Context context, io.bidmachine.rendering.internal.repository.a aVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "repository");
        this.f70042a = aVar;
        this.f70043b = context.getApplicationContext();
    }

    public final io.bidmachine.rendering.internal.adform.a a(AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        p.k(adElementParams, "adElementParams");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        switch (a.f70044a[adElementParams.getAdElementType().ordinal()]) {
            case 1:
                Context context = this.f70043b;
                p.j(context, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.html.a(context, this.f70042a, adElementParams, cVar, bVar, aVar, a(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()));
            case 2:
                Context context2 = this.f70043b;
                p.j(context2, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.video.a(context2, this.f70042a, adElementParams, cVar, bVar, aVar, b(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()));
            case 3:
                Context context3 = this.f70043b;
                p.j(context3, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.image.a(context3, this.f70042a, adElementParams, cVar, bVar, aVar);
            case 4:
                Context context4 = this.f70043b;
                p.j(context4, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.label.a(context4, this.f70042a, adElementParams, cVar, bVar, aVar);
            case 5:
                Context context5 = this.f70043b;
                p.j(context5, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.progress.a(context5, this.f70042a, adElementParams, cVar, bVar, aVar);
            case 6:
                Context context6 = this.f70043b;
                p.j(context6, "applicationContext");
                return new io.bidmachine.rendering.internal.adform.countdown.a(context6, this.f70042a, adElementParams, cVar, bVar, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final HtmlMeasurer a(MeasurerFactory measurerFactory, List list) {
        HtmlMeasurer htmlMeasurerCreateHtmlMeasurer;
        if (measurerFactory == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeasurerParams measurerParams = (MeasurerParams) it.next();
            try {
                htmlMeasurerCreateHtmlMeasurer = measurerFactory.createHtmlMeasurer(this.f70043b, measurerParams.getName(), measurerParams.getParameters());
            } catch (Throwable unused) {
                htmlMeasurerCreateHtmlMeasurer = null;
            }
            if (htmlMeasurerCreateHtmlMeasurer != null) {
                arrayList.add(htmlMeasurerCreateHtmlMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CompositeHtmlMeasurer(arrayList);
    }

    public final VideoMeasurer b(MeasurerFactory measurerFactory, List list) {
        VideoMeasurer videoMeasurerCreateVideoMeasurer;
        if (measurerFactory == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeasurerParams measurerParams = (MeasurerParams) it.next();
            try {
                videoMeasurerCreateVideoMeasurer = measurerFactory.createVideoMeasurer(this.f70043b, measurerParams.getName(), measurerParams.getParameters());
            } catch (Throwable unused) {
                videoMeasurerCreateVideoMeasurer = null;
            }
            if (videoMeasurerCreateVideoMeasurer != null) {
                arrayList.add(videoMeasurerCreateVideoMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CompositeVideoMeasurer(arrayList);
    }
}
