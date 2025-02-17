import xml.etree.ElementTree as ET

tree = ET.parse('bomb.xml')
root = tree.getroot()

print(root.text)