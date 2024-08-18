### First Time

- [x] Intro page
	- App Name
	- Description
	- Continue button

- [x] Login / Register
	- Register tab
		- Full Name
		- Username
		- Email
		- Password
		- Retype Password
		- Register Button (-> OTP Verification)
	- Login tab
		- Username / Email
		- Password
		- Login Button (-> OTP Verification)
	- Optional Login options (Google)

- [x] OTP Verification
	- Enter OTP box
	- Submit button

- [ ] Setup Profile
	- Monthly Limit
	- Categories
		- Name
		- Color (-> Color picker)

### Logged In

- [x] Homepage
	- Top bar
		- Username, greeting
		- Options
			- User settings button (-> User Page)
	- QR Scan button (-> Camera Scanner) (-> payment page with upi prefilled)
	- Pay to UPI or Phone button (-> Payment page)
	- Expenses
		- Current money expended in this month
		- Remaining
			- Total below it in less highlighted font
		- Categories: money spent, percentage of total spent.
			- Organised in decreasing order of money spent (-> category page with past expenses: amount and date-time)

- [x] Payment Page
	- UPI text field (prefilled if QR code scanned)
	- Amount to pay text field
	- Redirect button (-> Default Payment app)
	- Cancel button (-> Homepage)

- [x] Category Page
	- Category Name
	- Amount spent
	- Percentage of total spent
	- A simple bar graph of last 7 days of how much spent per day last week
	- Search bar to search payment based on note or date time
	- List of past expenses of current month with date time and amount
	- Collapsed list of previous months

- [x] User Settings page
	- Edit button on top right (-> edit mode)
	- Name
	- Username (unique)
	- Email
	- Change Password button (-> Popup to enter new password twice and OTP verification)
	- Monthly limit set
	- Categories
		- Create
			- Floating Card: Name, Description, Color
		- edit
			- Floating Card: Name, Description, Color
		- delete

- [x] Payment Completion Page
	- Payment Successful text
	- Payment Amount
	- Updated expenses row
		- Updated total spent
		- Updated percentage spent
	- Add to Category text
	- Category List (On Click -> Payment added to category)
	- Cancel button
