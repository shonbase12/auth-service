const express = require('express');
const router = express.Router();
const authMiddleware = require('../middleware/auth');

// Apply authentication middleware to the delete endpoint
router.delete('/delete', authMiddleware, (req, res) => {
  // Your delete logic here
  res.status(200).send('Delete operation successful');
});

module.exports = router;