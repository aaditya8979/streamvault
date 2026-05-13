package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.vast.VastExtension;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class AppodealExtensionTag extends ExtensionTag implements VastExtension {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IabElementStyle f69659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IabElementStyle f69660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IabElementStyle f69661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IabElementStyle f69662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IabElementStyle f69663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IabElementStyle f69664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IabElementStyle f69665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IabElementStyle f69666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PostBannerTag f69667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f69668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f69669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CompanionTag f69670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f69671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Float f69672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f69674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f69675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f69677v;

    public AppodealExtensionTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyle3;
        IabElementStyle iabElementStyle4;
        super(xmlPullParser);
        this.f69659d = new IabElementStyle();
        this.f69660e = new IabElementStyle();
        this.f69661f = new IabElementStyle();
        this.f69662g = new IabElementStyle();
        this.f69663h = new IabElementStyle();
        this.f69664i = new IabElementStyle();
        this.f69665j = new IabElementStyle();
        this.f69666k = new IabElementStyle();
        this.f69667l = new PostBannerTag();
        this.f69673r = false;
        this.f69674s = false;
        this.f69675t = false;
        this.f69676u = false;
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.VIDEO)) {
                    iabElementStyle = this.f69659d;
                } else if (VastXmlTag.a(name, VastTagName.LOADING_VIEW)) {
                    iabElementStyle = this.f69665j;
                } else if (VastXmlTag.a(name, VastTagName.COUNTDOWN)) {
                    iabElementStyle = this.f69666k;
                } else if (VastXmlTag.a(name, VastTagName.PROGRESS)) {
                    iabElementStyle = this.f69663h;
                } else if (VastXmlTag.a(name, VastTagName.CLOSEABLE_VIEW)) {
                    iabElementStyle = this.f69662g;
                } else if (VastXmlTag.a(name, VastTagName.MUTE)) {
                    iabElementStyle = this.f69661f;
                } else if (VastXmlTag.a(name, "CTA")) {
                    iabElementStyle = this.f69660e;
                } else if (VastXmlTag.a(name, VastTagName.REPEAT_VIEW)) {
                    iabElementStyle = this.f69664i;
                } else if (VastXmlTag.a(name, VastTagName.POSTBANNER)) {
                    this.f69667l.parse(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.AUTO_ROTATE)) {
                    this.f69671p = Boolean.valueOf(VastXmlTag.b(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.R1)) {
                    this.f69675t = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.R2)) {
                    this.f69676u = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.FORCE_ORIENTATION)) {
                    this.f69677v = VastXmlTag.g(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.CTA_TEXT)) {
                    this.f69660e.setContent(VastXmlTag.c(xmlPullParser));
                } else {
                    if (VastXmlTag.a(name, VastTagName.SHOW_CTA)) {
                        iabElementStyle2 = this.f69660e;
                    } else if (VastXmlTag.a(name, VastTagName.SHOW_MUTE)) {
                        iabElementStyle2 = this.f69661f;
                    } else if (VastXmlTag.a(name, VastTagName.SHOW_COMPANION)) {
                        this.f69667l.setVisible(VastXmlTag.b(xmlPullParser));
                    } else if (VastXmlTag.a(name, VastTagName.COMPANION_CLOSE_TIME)) {
                        int iF = VastXmlTag.f(VastXmlTag.c(xmlPullParser));
                        if (iF > -1) {
                            this.f69667l.setCloseTimeSec(iF);
                        }
                    } else if (VastXmlTag.a(name, VastTagName.MUTED)) {
                        this.f69673r = VastXmlTag.b(xmlPullParser);
                    } else if (VastXmlTag.a(name, VastTagName.VIDEO_CLICKABLE)) {
                        this.f69674s = VastXmlTag.b(xmlPullParser);
                    } else {
                        if (VastXmlTag.a(name, VastTagName.CTA_X_POSITION)) {
                            iabElementStyle3 = this.f69660e;
                        } else {
                            if (VastXmlTag.a(name, VastTagName.CTA_Y_POSITION)) {
                                iabElementStyle4 = this.f69660e;
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_X_POSITION)) {
                                iabElementStyle3 = this.f69662g;
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_Y_POSITION)) {
                                iabElementStyle4 = this.f69662g;
                            } else if (VastXmlTag.a(name, VastTagName.MUTE_X_POSITION)) {
                                iabElementStyle3 = this.f69661f;
                            } else if (VastXmlTag.a(name, VastTagName.MUTE_Y_POSITION)) {
                                iabElementStyle4 = this.f69661f;
                            } else if (VastXmlTag.a(name, VastTagName.ASSETS_COLOR)) {
                                Integer numC = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (numC != null) {
                                    this.f69668m = numC;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.ASSETS_BACKGROUND_COLOR)) {
                                Integer numC2 = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (numC2 != null) {
                                    this.f69669n = numC2;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.COMPANION)) {
                                CompanionTag companionTag = new CompanionTag(xmlPullParser);
                                if (companionTag.isValidTag() && companionTag.hasCreative()) {
                                    this.f69670o = companionTag;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_TIME)) {
                                String strC = VastXmlTag.c(xmlPullParser);
                                if (strC != null) {
                                    this.f69672q = Float.valueOf(Float.parseFloat(strC));
                                }
                            } else if (VastXmlTag.a(name, VastTagName.SHOW_PROGRESS)) {
                                iabElementStyle2 = this.f69663h;
                            } else {
                                VastXmlTag.d(xmlPullParser);
                            }
                            iabElementStyle4.setVerticalPosition(VastXmlTag.i(VastXmlTag.c(xmlPullParser)));
                        }
                        iabElementStyle3.setHorizontalPosition(VastXmlTag.h(VastXmlTag.c(xmlPullParser)));
                    }
                    iabElementStyle2.setVisible(Boolean.valueOf(VastXmlTag.b(xmlPullParser)));
                }
                VastXmlTag.a(xmlPullParser, iabElementStyle);
            }
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSION);
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getAssetsBackgroundColor() {
        return this.f69669n;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getAssetsColor() {
        return this.f69668m;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCloseStyle() {
        return this.f69662g;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Float getCloseTimeSec() {
        return this.f69672q;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public CompanionTag getCompanionTag() {
        return this.f69670o;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCountDownStyle() {
        return this.f69666k;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCtaStyle() {
        return this.f69660e;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getForceOrientation() {
        return this.f69677v;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getLoadingStyle() {
        return this.f69665j;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getMuteStyle() {
        return this.f69661f;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public PostBannerTag getPostBannerTag() {
        return this.f69667l;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getProgressStyle() {
        return this.f69663h;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getRepeatStyle() {
        return this.f69664i;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getVideoStyle() {
        return this.f69659d;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Boolean isAutoRotate() {
        return this.f69671p;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isMuted() {
        return this.f69673r;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isR1() {
        return this.f69675t;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isR2() {
        return this.f69676u;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isVideoClickable() {
        return this.f69674s;
    }
}
