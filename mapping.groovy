mapping {
    map duplicate() onto 'detectedDuplicate'
    map corrupt() onto 'detectedCorruption'
    map firstInSession() onto 'firstInSession'
    map timestamp() onto 'timestamp'
    map clientTimestamp() onto 'clientTimestamp'
    map remoteHost() onto 'remoteHost'
    map referer() onto 'referer'
    map location() onto 'location'
    map viewportPixelWidth() onto 'viewportPixelWidth'
    map viewportPixelHeight() onto 'viewportPixelHeight'
    map screenPixelWidth() onto 'screenPixelWidth'
    map screenPixelHeight() onto 'screenPixelHeight'
    map partyId() onto 'partyId'
    map sessionId() onto 'sessionId'
    map pageViewId() onto 'pageViewId'

    map eventType() onto 'eventType'
    map eventId() onto 'eventId'
    map eventParameters().value('content_id') onto 'content_id'
    map eventParameters().value('stay_time') onto 'stay_time'
    map eventParameters().value('content_click_time') onto 'content_click_time'

    def locationUri = parse location() to uri
    map locationUri.path() onto 'uriPath'

    def ua = userAgent()
    map userAgentString() onto 'userAgentString'
    map ua.name() onto 'userAgentName'
    map ua.family() onto 'userAgentFamily'
    map ua.vendor() onto 'userAgentVendor'
    map ua.type() onto 'userAgentType'
    map ua.osFamily() onto 'userAgentOsFamily'
    map ua.osVersion() onto 'userAgentOsVersion'
    map ua.osVendor() onto 'userAgentOsVendor'
}