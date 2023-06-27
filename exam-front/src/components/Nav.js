import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import { Link } from 'react-router-dom';

export function Nav(){
    return(<Box sx={{ flexGrow: 1 }}>
        <AppBar position="static">
          <Toolbar>

            <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
              Exam
            </Typography>
            <Button color="inherit"><Link to='/admin' style={{ textDecoration: 'none', color:'red' }}>Admin</Link></Button>
            <Button color="inherit"><Link to='/user' style={{ textDecoration: 'none', color:'white' }}>User</Link></Button>
          </Toolbar>
        </AppBar>
      </Box>);
}