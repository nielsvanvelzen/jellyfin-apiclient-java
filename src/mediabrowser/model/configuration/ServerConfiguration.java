package mediabrowser.model.configuration;

import mediabrowser.model.dto.*;
import mediabrowser.model.entities.*;

/** 
 Represents the server configuration.
*/
public class ServerConfiguration extends BaseApplicationConfiguration
{
	/** 
	 Gets or sets a value indicating whether [enable u pn p].
	 
	 <value><c>true</c> if [enable u pn p]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableUPnP;
	public final boolean getEnableUPnP()
	{
		return EnableUPnP;
	}
	public final void setEnableUPnP(boolean value)
	{
		EnableUPnP = value;
	}

	/** 
	 Gets or sets the public mapped port.
	 
	 <value>The public mapped port.</value>
	*/
	private int PublicPort;
	public final int getPublicPort()
	{
		return PublicPort;
	}
	public final void setPublicPort(int value)
	{
		PublicPort = value;
	}

	/** 
	 Gets or sets the public HTTPS port.
	 
	 <value>The public HTTPS port.</value>
	*/
	private int PublicHttpsPort;
	public final int getPublicHttpsPort()
	{
		return PublicHttpsPort;
	}
	public final void setPublicHttpsPort(int value)
	{
		PublicHttpsPort = value;
	}

	/** 
	 Gets or sets the HTTP server port number.
	 
	 <value>The HTTP server port number.</value>
	*/
	private int HttpServerPortNumber;
	public final int getHttpServerPortNumber()
	{
		return HttpServerPortNumber;
	}
	public final void setHttpServerPortNumber(int value)
	{
		HttpServerPortNumber = value;
	}

	/** 
	 Gets or sets the HTTPS server port number.
	 
	 <value>The HTTPS server port number.</value>
	*/
	private int HttpsPortNumber;
	public final int getHttpsPortNumber()
	{
		return HttpsPortNumber;
	}
	public final void setHttpsPortNumber(int value)
	{
		HttpsPortNumber = value;
	}

	/** 
	 Gets or sets a value indicating whether [use HTTPS].
	 
	 <value><c>true</c> if [use HTTPS]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableHttps;
	public final boolean getEnableHttps()
	{
		return EnableHttps;
	}
	public final void setEnableHttps(boolean value)
	{
		EnableHttps = value;
	}

	/** 
	 Gets or sets the value pointing to the file system where the ssl certiifcate is located..
	 
	 <value>The value pointing to the file system where the ssl certiifcate is located..</value>
	*/
	private String CertificatePath;
	public final String getCertificatePath()
	{
		return CertificatePath;
	}
	public final void setCertificatePath(String value)
	{
		CertificatePath = value;
	}

	/** 
	 Gets or sets a value indicating whether [enable internet providers].
	 
	 <value><c>true</c> if [enable internet providers]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableInternetProviders;
	public final boolean getEnableInternetProviders()
	{
		return EnableInternetProviders;
	}
	public final void setEnableInternetProviders(boolean value)
	{
		EnableInternetProviders = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is port authorized.
	 
	 <value><c>true</c> if this instance is port authorized; otherwise, <c>false</c>.</value>
	*/
	private boolean IsPortAuthorized;
	public final boolean getIsPortAuthorized()
	{
		return IsPortAuthorized;
	}
	public final void setIsPortAuthorized(boolean value)
	{
		IsPortAuthorized = value;
	}

	/** 
	 Gets or sets the item by name path.
	 
	 <value>The item by name path.</value>
	*/
	private String ItemsByNamePath;
	public final String getItemsByNamePath()
	{
		return ItemsByNamePath;
	}
	public final void setItemsByNamePath(String value)
	{
		ItemsByNamePath = value;
	}

	/** 
	 Gets or sets the metadata path.
	 
	 <value>The metadata path.</value>
	*/
	private String MetadataPath;
	public final String getMetadataPath()
	{
		return MetadataPath;
	}
	public final void setMetadataPath(String value)
	{
		MetadataPath = value;
	}

	/** 
	 Gets or sets the display name of the season zero.
	 
	 <value>The display name of the season zero.</value>
	*/
	private String SeasonZeroDisplayName;
	public final String getSeasonZeroDisplayName()
	{
		return SeasonZeroDisplayName;
	}
	public final void setSeasonZeroDisplayName(String value)
	{
		SeasonZeroDisplayName = value;
	}

	/** 
	 Gets or sets a value indicating whether [save local meta].
	 
	 <value><c>true</c> if [save local meta]; otherwise, <c>false</c>.</value>
	*/
	private boolean SaveLocalMeta;
	public final boolean getSaveLocalMeta()
	{
		return SaveLocalMeta;
	}
	public final void setSaveLocalMeta(boolean value)
	{
		SaveLocalMeta = value;
	}

	/** 
	 Gets or sets a value indicating whether [enable localized guids].
	 
	 <value><c>true</c> if [enable localized guids]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableLocalizedGuids;
	public final boolean getEnableLocalizedGuids()
	{
		return EnableLocalizedGuids;
	}
	public final void setEnableLocalizedGuids(boolean value)
	{
		EnableLocalizedGuids = value;
	}

	/** 
	 Gets or sets a value indicating whether [enable library metadata sub folder].
	 
	 <value><c>true</c> if [enable library metadata sub folder]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableLibraryMetadataSubFolder;
	public final boolean getEnableLibraryMetadataSubFolder()
	{
		return EnableLibraryMetadataSubFolder;
	}
	public final void setEnableLibraryMetadataSubFolder(boolean value)
	{
		EnableLibraryMetadataSubFolder = value;
	}

	/** 
	 Gets or sets the preferred metadata language.
	 
	 <value>The preferred metadata language.</value>
	*/
	private String PreferredMetadataLanguage;
	public final String getPreferredMetadataLanguage()
	{
		return PreferredMetadataLanguage;
	}
	public final void setPreferredMetadataLanguage(String value)
	{
		PreferredMetadataLanguage = value;
	}

	/** 
	 Gets or sets the metadata country code.
	 
	 <value>The metadata country code.</value>
	*/
	private String MetadataCountryCode;
	public final String getMetadataCountryCode()
	{
		return MetadataCountryCode;
	}
	public final void setMetadataCountryCode(String value)
	{
		MetadataCountryCode = value;
	}

	/** 
	 Characters to be replaced with a ' ' in strings to createUserAction a sort name
	 
	 <value>The sort replace characters.</value>
	*/
	private String[] SortReplaceCharacters;
	public final String[] getSortReplaceCharacters()
	{
		return SortReplaceCharacters;
	}
	public final void setSortReplaceCharacters(String[] value)
	{
		SortReplaceCharacters = value;
	}

	/** 
	 Characters to be removed from strings to createUserAction a sort name
	 
	 <value>The sort remove characters.</value>
	*/
	private String[] SortRemoveCharacters;
	public final String[] getSortRemoveCharacters()
	{
		return SortRemoveCharacters;
	}
	public final void setSortRemoveCharacters(String[] value)
	{
		SortRemoveCharacters = value;
	}

	/** 
	 Words to be removed from strings to createUserAction a sort name
	 
	 <value>The sort remove words.</value>
	*/
	private String[] SortRemoveWords;
	public final String[] getSortRemoveWords()
	{
		return SortRemoveWords;
	}
	public final void setSortRemoveWords(String[] value)
	{
		SortRemoveWords = value;
	}

	/** 
	 Gets or sets the minimum percentage of an item that must be played in order for playstate to be updated.
	 
	 <value>The min resume PCT.</value>
	*/
	private int MinResumePct;
	public final int getMinResumePct()
	{
		return MinResumePct;
	}
	public final void setMinResumePct(int value)
	{
		MinResumePct = value;
	}

	/** 
	 Gets or sets the maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
	 
	 <value>The max resume PCT.</value>
	*/
	private int MaxResumePct;
	public final int getMaxResumePct()
	{
		return MaxResumePct;
	}
	public final void setMaxResumePct(int value)
	{
		MaxResumePct = value;
	}

	/** 
	 Gets or sets the minimum duration that an item must have in order to be eligible for playstate updates..
	 
	 <value>The min resume duration seconds.</value>
	*/
	private int MinResumeDurationSeconds;
	public final int getMinResumeDurationSeconds()
	{
		return MinResumeDurationSeconds;
	}
	public final void setMinResumeDurationSeconds(int value)
	{
		MinResumeDurationSeconds = value;
	}

	/** 
	 The delay in seconds that we will wait after a file system change to try and discover what has been added/removed
	 Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several
	 different directories and files.
	 
	 <value>The file watcher delay.</value>
	*/
	private int RealtimeMonitorDelay;
	public final int getRealtimeMonitorDelay()
	{
		return RealtimeMonitorDelay;
	}
	public final void setRealtimeMonitorDelay(int value)
	{
		RealtimeMonitorDelay = value;
	}

	/** 
	 Gets or sets a value indicating whether [enable dashboard response caching].
	 Allows potential contributors without visual studio to modify production dashboard code and test changes.
	 
	 <value><c>true</c> if [enable dashboard response caching]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableDashboardResponseCaching;
	public final boolean getEnableDashboardResponseCaching()
	{
		return EnableDashboardResponseCaching;
	}
	public final void setEnableDashboardResponseCaching(boolean value)
	{
		EnableDashboardResponseCaching = value;
	}
	private boolean EnableDashboardResourceMinification;
	public final boolean getEnableDashboardResourceMinification()
	{
		return EnableDashboardResourceMinification;
	}
	public final void setEnableDashboardResourceMinification(boolean value)
	{
		EnableDashboardResourceMinification = value;
	}

	/** 
	 Allows the dashboard to be served from a custom path.
	 
	 <value>The dashboard source path.</value>
	*/
	private String DashboardSourcePath;
	public final String getDashboardSourcePath()
	{
		return DashboardSourcePath;
	}
	public final void setDashboardSourcePath(String value)
	{
		DashboardSourcePath = value;
	}

	private boolean MergeMetadataAndImagesByName;
	public final boolean getMergeMetadataAndImagesByName()
	{
		return MergeMetadataAndImagesByName;
	}
	public final void setMergeMetadataAndImagesByName(boolean value)
	{
		MergeMetadataAndImagesByName = value;
	}
	private boolean EnableStandaloneMetadata;
	public final boolean getEnableStandaloneMetadata()
	{
		return EnableStandaloneMetadata;
	}
	public final void setEnableStandaloneMetadata(boolean value)
	{
		EnableStandaloneMetadata = value;
	}

	/** 
	 Gets or sets the image saving convention.
	 
	 <value>The image saving convention.</value>
	*/
	private ImageSavingConvention ImageSavingConvention = getImageSavingConvention().values()[0];
	public final ImageSavingConvention getImageSavingConvention()
	{
		return ImageSavingConvention;
	}
	public final void setImageSavingConvention(ImageSavingConvention value)
	{
		ImageSavingConvention = value;
	}

	private MetadataOptions[] MetadataOptions;
	public final MetadataOptions[] getMetadataOptions()
	{
		return MetadataOptions;
	}
	public final void setMetadataOptions(MetadataOptions[] value)
	{
		MetadataOptions = value;
	}

	private String TranscodingTempPath;
	public final String getTranscodingTempPath()
	{
		return TranscodingTempPath;
	}
	public final void setTranscodingTempPath(String value)
	{
		TranscodingTempPath = value;
	}

	private boolean EnableAutomaticRestart;
	public final boolean getEnableAutomaticRestart()
	{
		return EnableAutomaticRestart;
	}
	public final void setEnableAutomaticRestart(boolean value)
	{
		EnableAutomaticRestart = value;
	}

	private boolean EnableRealtimeMonitor;
	public final boolean getEnableRealtimeMonitor()
	{
		return EnableRealtimeMonitor;
	}
	public final void setEnableRealtimeMonitor(boolean value)
	{
		EnableRealtimeMonitor = value;
	}
	private PathSubstitution[] PathSubstitutions;
	public final PathSubstitution[] getPathSubstitutions()
	{
		return PathSubstitutions;
	}
	public final void setPathSubstitutions(PathSubstitution[] value)
	{
		PathSubstitutions = value;
	}

	private String ServerName;
	public final String getServerName()
	{
		return ServerName;
	}
	public final void setServerName(String value)
	{
		ServerName = value;
	}
	private String WanDdns;
	public final String getWanDdns()
	{
		return WanDdns;
	}
	public final void setWanDdns(String value)
	{
		WanDdns = value;
	}

	private String UICulture;
	public final String getUICulture()
	{
		return UICulture;
	}
	public final void setUICulture(String value)
	{
		UICulture = value;
	}

	private PeopleMetadataOptions PeopleMetadataOptions;
	public final PeopleMetadataOptions getPeopleMetadataOptions()
	{
		return PeopleMetadataOptions;
	}
	public final void setPeopleMetadataOptions(PeopleMetadataOptions value)
	{
		PeopleMetadataOptions = value;
	}
	private boolean FindInternetTrailers;
	public final boolean getFindInternetTrailers()
	{
		return FindInternetTrailers;
	}
	public final void setFindInternetTrailers(boolean value)
	{
		FindInternetTrailers = value;
	}

	private String[] InsecureApps8;
	public final String[] getInsecureApps8()
	{
		return InsecureApps8;
	}
	public final void setInsecureApps8(String[] value)
	{
		InsecureApps8 = value;
	}

	private boolean SaveMetadataHidden;
	public final boolean getSaveMetadataHidden()
	{
		return SaveMetadataHidden;
	}
	public final void setSaveMetadataHidden(boolean value)
	{
		SaveMetadataHidden = value;
	}

	private NameValuePair[] ContentTypes;
	public final NameValuePair[] getContentTypes()
	{
		return ContentTypes;
	}
	public final void setContentTypes(NameValuePair[] value)
	{
		ContentTypes = value;
	}

	private boolean EnableAudioArchiveFiles;
	public final boolean getEnableAudioArchiveFiles()
	{
		return EnableAudioArchiveFiles;
	}
	public final void setEnableAudioArchiveFiles(boolean value)
	{
		EnableAudioArchiveFiles = value;
	}
	private boolean EnableVideoArchiveFiles;
	public final boolean getEnableVideoArchiveFiles()
	{
		return EnableVideoArchiveFiles;
	}
	public final void setEnableVideoArchiveFiles(boolean value)
	{
		EnableVideoArchiveFiles = value;
	}

	private boolean EnableLegacyCollections;
	public final boolean getEnableLegacyCollections()
	{
		return EnableLegacyCollections;
	}
	public final void setEnableLegacyCollections(boolean value)
	{
		EnableLegacyCollections = value;
	}

	/** 
	 Initializes a new instance of the <see cref="ServerConfiguration" /> class.
	*/
	public ServerConfiguration()
	{
		super();
		setImageSavingConvention(ImageSavingConvention.Compatible);
		setPublicPort(8096);
		setPublicHttpsPort(8920);
		setHttpServerPortNumber(8096);
		setHttpsPortNumber(8920);
		setEnableHttps(false);
		setEnableDashboardResponseCaching(true);
		setEnableDashboardResourceMinification(true);

		setEnableAutomaticRestart(true);

		setEnableUPnP(true);

		setMinResumePct(5);
		setMaxResumePct(90);

		// 5 minutes
		setMinResumeDurationSeconds(300);

		setRealtimeMonitorDelay(30);

		setEnableInternetProviders(true);
		setFindInternetTrailers(true);

		setPathSubstitutions(new PathSubstitution[] { });
		setContentTypes(new NameValuePair[] { });

		setPreferredMetadataLanguage("en");
		setMetadataCountryCode("US");

		setSortReplaceCharacters(new String[] {".", "+", "%"});
		setSortRemoveCharacters(new String[] {",", "&", "-", "{", "}", "'"});
		setSortRemoveWords(new String[] {"the", "a", "an"});

		setSeasonZeroDisplayName("Specials");

		setEnableRealtimeMonitor(true);

		setUICulture("en-us");

		setPeopleMetadataOptions(new PeopleMetadataOptions());

		setInsecureApps8(new String[] {"Chromecast", "iOS", "Unknown app", "MediaPortal", "Media Portal", "iPad", "iPhone", "Roku", "Windows Phone"});
	}
}