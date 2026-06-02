// Input validation for GET /transactions
const validateGetTransactionsInput = (req, res, next) => {
    const { userId, startDate, endDate } = req.query;

    if (!userId) {
        return res.status(400).json({ error: 'User ID is required.' });
    }

    // Additional validation logic for dates can be added here

    next();
};

module.exports = validateGetTransactionsInput;