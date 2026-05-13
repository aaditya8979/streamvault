package io.bidmachine.iab.vast.processor;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import hi.a;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdContentTag;
import io.bidmachine.iab.vast.tags.AdTag;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionAdsCreativeTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.CreativeContentTag;
import io.bidmachine.iab.vast.tags.CreativeTag;
import io.bidmachine.iab.vast.tags.ExtensionTag;
import io.bidmachine.iab.vast.tags.InLineAdTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VastParser;
import io.bidmachine.iab.vast.tags.VastTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import io.bidmachine.iab.vast.tags.WrapperAdTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public class VastProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VastRequest f69641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VastMediaPicker f69642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f69644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69645e;

    public VastProcessor(@NonNull VastRequest vastRequest, @NonNull VastMediaPicker<MediaFileTag> vastMediaPicker) {
        this(vastRequest, vastMediaPicker, 5);
    }

    public VastProcessor(VastRequest vastRequest, VastMediaPicker vastMediaPicker, int i10) {
        this.f69645e = 0;
        this.f69641a = vastRequest;
        this.f69642b = vastMediaPicker;
        this.f69643c = i10;
        this.f69644d = new Stack();
    }

    private Pair a(InLineAdTag inLineAdTag) {
        LinearCreativeTag linearCreativeTag;
        List<MediaFileTag> mediaFileTagList;
        List<CreativeTag> creativeTagList = inLineAdTag.getCreativeTagList();
        if (creativeTagList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if ((creativeContentTag instanceof LinearCreativeTag) && (mediaFileTagList = (linearCreativeTag = (LinearCreativeTag) creativeContentTag).getMediaFileTagList()) != null && !mediaFileTagList.isEmpty()) {
                    Iterator<MediaFileTag> it = mediaFileTagList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(linearCreativeTag, it.next()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairPickVideo = this.f69642b.pickVideo(arrayList);
        return pairPickVideo != null ? pairPickVideo : new Pair(null, null);
    }

    private VastProcessorResult a(AdContentTag adContentTag, VastTag vastTag, a aVar) {
        VastSpecError vastSpecError;
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        for (int i10 = 0; i10 < vastTag.getAdTagList().size(); i10++) {
            AdTag adTag = vastTag.getAdTagList().get(i10);
            if (adTag != null && adTag.getAdContentTag() != null) {
                AdContentTag adContentTag2 = adTag.getAdContentTag();
                if (adContentTag2 instanceof InLineAdTag) {
                    VastProcessorResult vastProcessorResultB = b((InLineAdTag) adContentTag2);
                    if (vastProcessorResultB.hasVastAd()) {
                        return vastProcessorResultB;
                    }
                    a(vastProcessorResultB.a());
                    if (adContentTag == null) {
                        vastProcessorResult.a(vastProcessorResultB.getVastSpecError());
                    } else if (vastProcessorResultB.b()) {
                        VastSpecError vastSpecError2 = vastProcessorResultB.getVastSpecError();
                        if (vastSpecError2 == null) {
                            vastSpecError2 = VastSpecError.UNKNOWN;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError2);
                    }
                } else if ((adContentTag2 instanceof WrapperAdTag) && aVar.c()) {
                    VastProcessorResult vastProcessorResultA = a((WrapperAdTag) adContentTag2);
                    if (vastProcessorResultA.hasVastAd()) {
                        return vastProcessorResultA;
                    }
                    a(vastProcessorResultA.a());
                    if (adContentTag != null) {
                        if (vastProcessorResultA.b()) {
                            vastSpecError = vastProcessorResultA.getVastSpecError();
                            if (vastSpecError == null) {
                                vastSpecError = VastSpecError.UNKNOWN;
                            }
                        } else {
                            vastSpecError = VastSpecError.WRAPPER_RESPONSE_NO_AD;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError);
                    } else {
                        vastProcessorResult.a(VastSpecError.WRAPPER_RESPONSE_NO_AD);
                    }
                    if (i10 == 0 && !aVar.b()) {
                        return vastProcessorResult;
                    }
                }
                b(adContentTag2);
            }
        }
        if (vastProcessorResult.getVastSpecError() == null && adContentTag != null) {
            vastProcessorResult.a(adContentTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
        }
        return vastProcessorResult;
    }

    private ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f69644d.empty()) {
            return arrayList;
        }
        for (AdContentTag adContentTag : this.f69644d) {
            if (adContentTag != null && adContentTag.getErrorUrlList() != null) {
                arrayList.addAll(adContentTag.getErrorUrlList());
            }
        }
        return arrayList;
    }

    private ArrayList a(AdContentTag adContentTag) {
        ArrayList arrayList = new ArrayList();
        List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
        if (creativeTagList == null) {
            return arrayList;
        }
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                    arrayList.addAll(((CompanionAdsCreativeTag) creativeContentTag).getCompanionTagList());
                }
            }
        }
        return arrayList;
    }

    private void a(List list, CompanionAdsCreativeTag companionAdsCreativeTag) {
        List<String> companionClickTrackingList;
        for (CompanionTag companionTag : companionAdsCreativeTag.getCompanionTagList()) {
            if (!companionTag.hasCreative() && (companionClickTrackingList = companionTag.getCompanionClickTrackingList()) != null) {
                list.addAll(companionClickTrackingList);
            }
        }
    }

    private void a(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            TrackingEvent trackingEvent = (TrackingEvent) entry.getKey();
            List arrayList = (List) map.get(trackingEvent);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(trackingEvent, arrayList);
            }
            arrayList.addAll((Collection) entry.getValue());
        }
    }

    private VastProcessorResult b(InLineAdTag inLineAdTag) {
        VastSpecError vastSpecError;
        this.f69644d.push(inLineAdTag);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        Pair pairA = a(inLineAdTag);
        if (pairA == null) {
            vastSpecError = VastSpecError.XML_VALIDATE;
        } else {
            if (pairA.first != null || pairA.second != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> arrayList3 = new ArrayList<>();
                EnumMap enumMap = new EnumMap(TrackingEvent.class);
                ArrayList arrayList4 = new ArrayList();
                AppodealExtensionTag appodealExtensionTag = null;
                if (!this.f69644d.empty()) {
                    for (AdContentTag adContentTag : this.f69644d) {
                        if (adContentTag != null) {
                            if (adContentTag.getImpressionUrlList() != null) {
                                arrayList.addAll(adContentTag.getImpressionUrlList());
                            }
                            List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
                            if (creativeTagList != null) {
                                for (CreativeTag creativeTag : creativeTagList) {
                                    if (creativeTag != null) {
                                        CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                                        if (creativeContentTag instanceof LinearCreativeTag) {
                                            LinearCreativeTag linearCreativeTag = (LinearCreativeTag) creativeContentTag;
                                            VideoClicksTag videoClicksTag = linearCreativeTag.getVideoClicksTag();
                                            if (videoClicksTag != null && videoClicksTag.getClickTrackingUrlList() != null) {
                                                arrayList2.addAll(videoClicksTag.getClickTrackingUrlList());
                                            }
                                            a(enumMap, linearCreativeTag.getTrackingEventListMap());
                                        } else if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                                            a(arrayList3, (CompanionAdsCreativeTag) creativeContentTag);
                                        }
                                    }
                                }
                            }
                            List<ExtensionTag> extensionTagList = adContentTag.getExtensionTagList();
                            if (extensionTagList != null) {
                                for (ExtensionTag extensionTag : extensionTagList) {
                                    if (extensionTag instanceof AppodealExtensionTag) {
                                        if (appodealExtensionTag == null) {
                                            appodealExtensionTag = (AppodealExtensionTag) extensionTag;
                                        }
                                    } else if (extensionTag instanceof AdVerificationsExtensionTag) {
                                        arrayList4.add((AdVerificationsExtensionTag) extensionTag);
                                    }
                                }
                            }
                        }
                    }
                }
                VastAd vastAd = new VastAd((LinearCreativeTag) pairA.first, (MediaFileTag) pairA.second);
                vastAd.d(arrayList);
                vastAd.c(a());
                vastAd.a(arrayList2);
                vastAd.setWrapperCompanionClickTrackingUrlList(arrayList3);
                vastAd.a(enumMap);
                vastAd.b(a((AdContentTag) inLineAdTag));
                vastAd.a(appodealExtensionTag);
                vastAd.setAdVerificationsExtensionList(arrayList4);
                vastProcessorResult.a(vastAd);
                return vastProcessorResult;
            }
            vastSpecError = VastSpecError.BAD_FILE;
        }
        vastProcessorResult.a(inLineAdTag, vastSpecError);
        return vastProcessorResult;
    }

    private boolean b() {
        return this.f69645e >= this.f69643c;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.bidmachine.iab.vast.processor.VastProcessorResult a(io.bidmachine.iab.vast.tags.WrapperAdTag r10) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.iab.vast.processor.VastProcessor.a(io.bidmachine.iab.vast.tags.WrapperAdTag):io.bidmachine.iab.vast.processor.VastProcessorResult");
    }

    public void a(List list) {
        this.f69641a.fireErrorUrls(list, null);
    }

    public void b(AdContentTag adContentTag) {
        if (this.f69644d.empty()) {
            return;
        }
        int iSearch = this.f69644d.search(adContentTag);
        for (int i10 = 0; i10 < iSearch; i10++) {
            this.f69644d.pop();
        }
    }

    @NonNull
    public VastProcessorResult process(@Nullable String str) {
        VastSpecError vastSpecError;
        VastTag vast;
        VastLog.d("VastProcessor", "process", new Object[0]);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        try {
            vast = VastParser.parseVast(str);
        } catch (Exception unused) {
            vastSpecError = VastSpecError.XML_PARSING;
        }
        if (vast != null && vast.hasAd()) {
            return a(null, vast, new a());
        }
        vastSpecError = VastSpecError.XML_VALIDATE;
        vastProcessorResult.a(vastSpecError);
        return vastProcessorResult;
    }
}
