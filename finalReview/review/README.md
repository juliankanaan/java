### Date object

GregorianCalendar - a subclass of the abstract Calendar parent

Empty object -> is for current date right now
`Calendar calendar1 = new GregorianCalendar();`

Construct with args of (year, month, dayOfMonth) [ints]
`Calendar cal2 = new GregorianCalendar(1996, 12, 14); `

### Accessing GregorianCalendar stuff
Year:
Sysout ( cal2.get(Calendar.YEAR) ); 
