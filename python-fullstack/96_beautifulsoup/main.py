"""Program to demonstrate BeautifulSoup (BS) package."""

# Install: pip install beautifulsoup4
try:
    from bs4 import BeautifulSoup

    html = """
    <html>
    <body>
    <h1>Title</h1>
    <p class="intro">First paragraph</p>
    <p>Second paragraph</p>
    <a href="http://example.com">Link</a>
    </body>
    </html>
    """
    soup = BeautifulSoup(html, "html.parser")
    print("Title:", soup.h1.text)
    print("First p:", soup.find("p", class_="intro").text)
    print("All p:", [p.text for p in soup.find_all("p")])
    print("Link href:", soup.a["href"])
except ImportError:
    print("Install: pip install beautifulsoup4")
