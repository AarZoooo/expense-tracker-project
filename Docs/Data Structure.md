### FireStore structure

- Users Collection
	- **Document ID (User ID)** (generated)
    - name
    - email
    - monthlyLimit

	- Categories Sub-collection
		- **Document ID (Category NAME)**
	    - color

	- Transactions Sub-collection:
		- **Document ID (Transaction ID)**
	    - recipientUPIId
	    - amount
	    - dateTime (indexed)
	    - CategoryID (Reference to Category Document)
