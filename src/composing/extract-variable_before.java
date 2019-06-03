void renderBanner() {
final boolean findMAC = platform.toUpperCase().indexOf("MAC") > -1;
final boolean findIE = browser.toUpperCase().indexOf("IE") > -1;

  if ((findMAC) &&
       (findIE) &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}
